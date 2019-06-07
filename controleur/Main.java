package controleur;

import modele.*;
import vue.*;


public class Main {

    public static void main(String [] args)
    {
        /*
        Niveau troisieme = new Niveau(3, "Troisieme");
        Classe Classe1 = new Classe(troisieme, 0);

        Discipline Lesmaths = new Discipline(1, "MATHEMATIQUES");
        Enseignant crambes = new Enseignant(1, "Meshkour ", "Houari");
        Enseignement maths = new Enseignement(crambes, Lesmaths, 1);


        Eleve x_eleve = new Eleve(1, "Partouche", "Raphael", "12/12/12", 3,0);
        Eleve y_eleve = new Eleve(2, "Lendais", "Thibault", "12/12/12", 4,0);

        Ecole ece = new Ecole();
        ece.addClasse(Classe1);

        ece.get_tabClass().get(0).addeleveauneclasse(x_eleve);
        ece.get_tabClass().get(0).addeleveauneclasse(y_eleve);
        ece.get_tabClass().get(0).addcoursauneClasse(maths);
        */

        //System.out.println(ece.toString());

        Ecole ece = new Ecole();
        ece.getDataECOLEfromSQLdatabase();
        System.out.println(ece.toString());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }

        });

        /* try {
            //connection to database
           // Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/demo", "root", "root");

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

            //create statement
            Statement myStmt = myConn.createStatement();

            //execute sql query
            ResultSet myRs = myStmt.executeQuery("select * from employees");

            //results set
            while (myRs.next()) {
                System.out.println(myRs.getString("prenom")+ " , "+myRs.getString("nom"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        */
    }
}
