package modele;

import java.util.*;

public class Enseignant extends Personne{

    //private int id_Enseignant;
    private ArrayList<Enseignement> tab_enseignement;

    public Enseignant(){
        this.tab_enseignement = new ArrayList<Enseignement>();
    }
    public Enseignant(int id_, String _nom, String _prenom){
        super(id_,_nom,_prenom);
        this.tab_enseignement = new ArrayList<Enseignement>();
    }

    public void inscriptionEnseignement(){
        // Coder l'inscription a un enseignement, remplissage de tab_enseignement
        System.out.println("Inscription a un enseignement a faire");
    }

    @Override
    public String toString(){
        String result = " Nom : " + this.nom +  ", Prenom : " + this.prenom + "";
        return result;
    }

}