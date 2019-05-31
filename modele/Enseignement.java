package modele;

import java.util.ArrayList;

public class Enseignement {


    private Enseignant LeProf;
    private Discipline LaDiscipline;
    private int id_Enseignement;
    private ArrayList<Classe> LesClasses;

    public Enseignement(){
        this.LeProf = new Enseignant();
        this.id_Enseignement =0;
        this.LaDiscipline = new Discipline();
        this.LesClasses = new ArrayList<>();

        System.out.println("Constructeur par defaut de de Enseignement");

    }
    public Enseignement(Enseignant _LeProf, Discipline _LaDiscipline,int _id_Enseignement){
        this.LaDiscipline = _LaDiscipline;
        this.id_Enseignement = _id_Enseignement;
        this.LeProf = _LeProf;
        this.LesClasses = new ArrayList<>();
    }

    @Override
    public String toString(){
        String results = "";

        results = results + "Info du cours : " + this.LaDiscipline.toString() + "";
        results = results + " Professeur : " + this.LeProf.toString() + "";
        results = results + " Id Enseignement : " + this.id_Enseignement + "";

        return results;
    }

    public void addClassetoArrayListEnseignementinEnseignement(Classe x){
        this.LesClasses.add(x);
    }


}
