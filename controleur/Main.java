package controleur;

import modele.*;

public class Main {

    public static void main(String [] args)
    {
        Niveau troisieme = new Niveau(3, "Troisieme");
        Classe Classe1 = new Classe(troisieme, 0);

       // Personne perso1 = new Personne(1, "Partouche", "Raphael");
        Eleve x_eleve = new Eleve(1, "Partouche", "Raphael", "12/12/12", 3,0);
        Eleve y_eleve = new Eleve(2, "Lendais", "thibault", "12/12/12", 4,0);


        Ecole ece = new Ecole();
        ece.addClasse(Classe1);

        ece.get_tabClass().get(0).addeleveauneclasse(x_eleve);
        ece.get_tabClass().get(0).addeleveauneclasse(y_eleve);

        System.out.println(ece.toString());


    }
}
