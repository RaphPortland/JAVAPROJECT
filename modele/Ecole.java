package modele;

import java.util.ArrayList;
import java.util.Iterator;

public class Ecole {


    private ArrayList<Classe> tab_classe;

    public Ecole(){
        this.tab_classe = new ArrayList<>();
    }

    public void addClasse(Classe A) {
        this.tab_classe.add(A);
    }

    public ArrayList<Classe> get_tabClass(){
        return this.tab_classe;
    }

    @Override
    public String toString(){
        String results= "Classe : \n";
        if(this.tab_classe.size()>0){
            for (Classe temp : this.tab_classe) {

                results = results + temp.toString();

            }
        }

        return results;
    }
}
