package modele;

import java.util.ArrayList;
import java.sql.*;
import java.util.Objects;


public class Ecole {


    private ArrayList<Classe> tab_classe;
    private ArrayList<Eleve> listeEleve;
    private ArrayList<Enseignant> listeEnseignant;
    private ArrayList<Niveau> listeNiveau;
    private ArrayList<AnneeScolaire> listeannescolaire;
    private ArrayList<Discipline> listeDiscipline;




    public Ecole(){
        this.tab_classe = new ArrayList<>();
        this.listeEleve = new ArrayList<>();
        this.listeEnseignant = new ArrayList<>();
        this.listeNiveau = new ArrayList<>();
        this.listeannescolaire = new ArrayList<>();
        this.listeDiscipline = new ArrayList<>();

    }
    public void addClasse(Classe A) {
        this.tab_classe.add(A);
    }
    public ArrayList<Classe> get_tabClass(){
        return this.tab_classe;
    }
    public ArrayList<Niveau> get_tabNiveau(){
        return this.listeNiveau;
    }
    public ArrayList<AnneeScolaire> get_tabanneescolaire(){
        return this.listeannescolaire;
    }
    public ArrayList<Discipline> get_tabDiscipline(){
        return this.listeDiscipline;
    }


    public int getnbreleve(){return this.listeEleve.size();}
    public int getnbrenseignant(){return this.listeEnseignant.size();}
    public int getnbrdeclasse(){return this.tab_classe.size();}
    public int getnbrdhomme(){
        int i=0;
        for (Eleve a : this.listeEleve){
            if(Objects.equals(a.getsexe(), "h")){
                i=i+1;
            }
        }

        return i;
    }

    public void inscriptiondunnouvelleeleve(String Nom, String Prenom, String Sexe, int Iddelaclasse){
        updateDELETEINSERTUPDATE("INSERT INTO `Personne`(`Nom`, `Prenom`, `Sexe`, `Type`) VALUES ('"+ Nom +"','"+ Prenom +"','"+ Sexe +"',"+ 2 +")");

        ResultSet myRsidnewperso = update("select Id FROM `Personne` WHERE Nom = '"+ Nom +"' AND Prenom = '" + Prenom +"'");
        int id_neweleve=-3;
        try{
            while (myRsidnewperso.next()){
                id_neweleve = Integer.parseInt(myRsidnewperso.getString("Id"));

            }

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        updateDELETEINSERTUPDATE("INSERT INTO `Inscription`(`#IdC`, `#IdP`) VALUES ("+ Iddelaclasse + ","+ id_neweleve+")");

    }

    public void inscriptiondunnouveauprof(String Nom, String Prenom, String Sexe){
        updateDELETEINSERTUPDATE("INSERT INTO `Personne`(`Nom`, `Prenom`, `Sexe`, `Type`) VALUES ('"+ Nom +"','"+ Prenom +"','"+ Sexe +"',"+ 1 +")");
    }

    public void creationnouvelleclasse(int id_annee_scolaire, String Nomdelaclasse, int id_niveau){
        updateDELETEINSERTUPDATE("INSERT INTO `Classe`(`#IdAS`, `Nom`, `#IdE`, `#IdN`) VALUES ("+ id_annee_scolaire + ",'"+ Nomdelaclasse +"',1,"+ id_niveau+")");
    }

    public void supresseleve(){
        updateDELETEINSERTUPDATE("DELETE FROM `Personne` WHERE Nom ='Burt'");
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


    public void getDataECOLEfromSQLdatabase(){

        ResultSet myRsperso = update("select * FROM `Personne` ");

        try{

            while (myRsperso.next()) {

                if(Integer.parseInt(myRsperso.getString("Type")) == 2){
                    Eleve w_a = new Eleve(Integer.parseInt(myRsperso.getString("Id")), myRsperso.getString("Nom"),myRsperso.getString("Prenom"),myRsperso.getString("Sexe"));
                    listeEleve.add(w_a);
                } else {
                    Enseignant w_a = new Enseignant(Integer.parseInt(myRsperso.getString("Id")), myRsperso.getString("Nom"),myRsperso.getString("Prenom"),myRsperso.getString("Sexe"));
                    listeEnseignant.add(w_a);
                }

            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }

        ResultSet myRsniveau = update("select * FROM `Niveau` ");
        try{

            while (myRsniveau.next()) {
                Niveau a = new Niveau(Integer.parseInt(myRsniveau.getString("Id")), myRsniveau.getString("Nom"));
                this.listeNiveau.add(a);
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }

        ResultSet myRsAS = update("select * FROM `AnneeScolaire` ");
        try{
            while (myRsAS.next()) {
                AnneeScolaire a = new AnneeScolaire(Integer.parseInt(myRsAS.getString("Id")),myRsAS.getString("Annee"));
                this.listeannescolaire.add(a);
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }


        ResultSet myRsDiscipline1 = update("select * FROM `Discipline` ");
        try{

            while (myRsDiscipline1.next()) {
                Discipline a =new Discipline(Integer.parseInt(myRsDiscipline1.getString("Id")),myRsDiscipline1.getString("Nom"));
                this.listeDiscipline.add(a);
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }


        ResultSet myRs= update("select * from Ecole");
        try{
            while (myRs.next()) {



               String sql = "SELECT * FROM `Classe` WHERE `#IdE`=" + Integer.parseInt(myRs.getString("Id"))+";";
                ResultSet myRsClasse = update(sql);
                try{

                    while (myRsClasse.next()) {


                        ResultSet myRsNiveau = update("select * FROM `Niveau` WHERE Id = " + myRsClasse.getString("#IdN"));


                        try{

                            while (myRsNiveau.next()) {

                                Niveau Niveau_ = new Niveau(Integer.parseInt(myRsNiveau.getString("Id")), myRsNiveau.getString("Nom"));
                                System.out.println(Niveau_.toString());

                                ResultSet myRsAnnee = update("select * FROM `AnneeScolaire` WHERE Id = " + myRsClasse.getString("#IdAS"));

                                try{

                                    while (myRsAnnee.next()) {

                                        AnneeScolaire an = new AnneeScolaire(Integer.parseInt(myRsAnnee.getString("Id")), myRsAnnee.getString("Annee"));
                                        System.out.println(Niveau_.toString());

                                        Classe newclasse = new Classe(Niveau_,Integer.parseInt(myRsClasse.getString("Id") ), an,myRsClasse.getString("Nom"));
                                        tab_classe.add(newclasse);
                                    }
                                }
                                catch (Exception exc) {
                                    exc.printStackTrace();
                                }



                            }
                        }
                        catch (Exception exc) {
                            exc.printStackTrace();
                        }
                        //Classe classeI = new Classe();
                        ResultSet myRsEnseignement = update("select * FROM `Enseignement` WHERE `#IdC`=" + Integer.parseInt(myRsClasse.getString("Id")));

                        try{

                            while (myRsEnseignement.next()) {

                                Discipline LaDiscipline = new Discipline();
                                Enseignant leProf_= new Enseignant();
                                ResultSet myRsDiscipline = update("select * FROM `Discipline` WHERE Id=" + Integer.parseInt(myRsEnseignement.getString("#IdD")));
                                try{

                                    while (myRsDiscipline.next()) {
                                        LaDiscipline = new Discipline(Integer.parseInt(myRsDiscipline.getString("Id")), myRsDiscipline.getString("Nom"));


                                    }
                                }
                                catch (Exception exc) {
                                    exc.printStackTrace();
                                }

                                ResultSet myRsProf = update("select * FROM `Personne` WHERE Type=1 AND Id=" + Integer.parseInt(myRsEnseignement.getString("#IdP")));
                                try{

                                    while (myRsProf.next()) {
                                        leProf_ = new Enseignant(Integer.parseInt(myRsProf.getString("Id")), myRsProf.getString("Nom"),myRsProf.getString("Nom"),myRsProf.getString("Sexe"));


                                    }
                                }
                                catch (Exception exc) {
                                    exc.printStackTrace();
                                }

                                Enseignement Enseignement_i = new Enseignement(leProf_,LaDiscipline, Integer.parseInt(myRsEnseignement.getString("Id")));
                                int x_ = 0;
                                for(Classe a : this.tab_classe){
                                    if(a.getId() == Integer.parseInt(myRsClasse.getString("Id"))){
                                        this.tab_classe.get(x_).addcoursauneClasse(Enseignement_i);
                                    }
                                    x_ = x_ +1;
                                }
                            }
                        }
                        catch (Exception exc) {
                            exc.printStackTrace();
                        }

                    }
                }
                catch (Exception exc) {
                    exc.printStackTrace();
                }

            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }




        ResultSet myRsEleve = update("select * FROM `Personne` WHERE `Type`=2");

        try{

            while (myRsEleve.next()) {

                Eleve ELEVE____ = new Eleve();
                ResultSet myRsInscript = update("select * FROM `Inscription` WHERE `#IdP`=" + Integer.parseInt(myRsEleve.getString("Id")));

                try{

                    while (myRsInscript.next()) {

                        ELEVE____ = new Eleve(Integer.parseInt(myRsEleve.getString("Id")),myRsEleve.getString("Nom"),myRsEleve.getString("Prenom"),"1990/12/12",Integer.parseInt(myRsInscript.getString("Id")),Integer.parseInt(myRsInscript.getString("#IdC")),myRsEleve.getString("Sexe"));
                      //  Inscription Inscri_ = new Inscription("1990/12/12",Integer.parseInt(myRsInscript.getString("Id")),Integer.parseInt(myRsInscript.getString("#IdC")));
                        int x_ = 0;
                        for(Classe a : this.tab_classe){
                            if(a.getId() == Integer.parseInt(myRsInscript.getString("#IdC"))){
                                this.tab_classe.get(x_).addeleveauneclasse(ELEVE____);
                            }
                            x_ = x_ +1;
                        }

                    }
                }
                catch (Exception exc) {
                    exc.printStackTrace();
                }

            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }




    }

    public static ResultSet update(String sqlrequest){
        try {
            //connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/ProjetInfoIng3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

            //create statement
            Statement myStmt = myConn.createStatement();

            //execute sql query
            ResultSet myRs = myStmt.executeQuery(sqlrequest);

            return myRs;
        }
        catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }

    }

    public static void updateDELETEINSERTUPDATE(String sqlrequest){
        try {
            //connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:8889/ProjetInfoIng3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");

            //create statement
            Statement myStmt = myConn.createStatement();

            //execute sql query
            myStmt.executeUpdate(sqlrequest);


        }
        catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}
