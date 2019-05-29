package modele;

import java.util.ArrayList;

public class Inscription {

    private String Date_Inscription;
    private int Id_Inscription;
    private int Id_Classe;

    public Inscription(){

        this.Date_Inscription = "00/00/0000";
        this.Id_Inscription = -4;
        this.Id_Classe = -4;
    }

    public Inscription(String _Date_Inscription, int _Id_Inscription, int _id_classe){
        this.Date_Inscription = _Date_Inscription;
        this.Id_Inscription = _Id_Inscription;
        this.Id_Classe = _id_classe;
    }

    public void addtoClasse(int numerodeclasse){

    }

}
