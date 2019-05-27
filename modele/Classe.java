package modele;

import java.util.ArrayList;

public class Classe {

    private Niveau LeNiveau;
    private int id_Classe;
    private ArrayList<Enseignement> Tab_Cours;

    public Classe(){
        this.LeNiveau = new Niveau();
        this.id_Classe = -2;
        this.Tab_Cours = new ArrayList<>();
    }

    public Classe(Niveau a, int _id_Classe){
        this.LeNiveau = a;
        this.id_Classe = _id_Classe;
        this.Tab_Cours = new ArrayList<>();
    }
    public void addcoursauneClasse(Enseignement x){
        this.Tab_Cours.add(x);
    }

}
