package modele;

public class Trimestre {


    private AnneeScolaire AnnScolaire;
    private int id_trimestre;


   public Trimestre(){
       this.AnnScolaire = new AnneeScolaire();
       this.id_trimestre = -4;
   }
    public Trimestre(AnneeScolaire a , int b){
        this.AnnScolaire = a;
        this.id_trimestre = b;
    }

    @Override
    public String toString(){
       return this.AnnScolaire.toString() + "id_trimestre" + this.id_trimestre + "\n";
    }

}
