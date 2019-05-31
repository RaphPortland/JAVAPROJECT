package modele;

import java.util.ArrayList;
import java.sql.*;



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


    public void getDataECOLEfromSQLdatabase(){
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

                                Classe newclasse = new Classe(Niveau_,Integer.parseInt(myRsClasse.getString("Id") ));
                                tab_classe.add(newclasse);
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
                                        leProf_ = new Enseignant(Integer.parseInt(myRsProf.getString("Id")), myRsProf.getString("Nom"),myRsProf.getString("Nom"));


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

                        ELEVE____ = new Eleve(Integer.parseInt(myRsEleve.getString("Id")),myRsEleve.getString("Nom"),myRsEleve.getString("Prenom"),"1990/12/12",Integer.parseInt(myRsInscript.getString("Id")),Integer.parseInt(myRsInscript.getString("#IdC")));
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
}
