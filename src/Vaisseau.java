import java.io.IOException;
import java.util.Scanner;

public class Vaisseau {

  public  String name;

  public int nbMissileMax;
   public int nbMissile;
   private boolean enVol = false;


   /*
    ----------------------------------------------------------
    Constrcuteur
    */



/*
   ----------------------------------------------------------------------------------------------
   Get et SET
   */

    public int getNbMissileMax() {
        return this.nbMissileMax;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        System.out.println("Quel nom veux tu donner à ton vaisseau");

            Scanner scan = new Scanner(System.in);
            this.name = scan.nextLine();
        while (name == null || name.length()<= 1){
            System.out.println("Votre nom de vaisseau n'est pas valide , veuillez rentre\nVeuillez en rentrer un nouveau");
            this.name = scan.nextLine();
        }






    }
    public int getNbMissile() {
        return this.nbMissile;
    }
// Demande combien de missile il veut mettre en sachant que si
    // le nombre de missile est plus petit que 3 on demande de recharger
    public void setNbMissile() throws IOException {
        nbMissileMax=10;
        int choixNbMissile;
        Scanner scan = new Scanner(System.in);
        System.out.println("Combien veux tu mettre de missiles dans ton vaisseau ");
         choixNbMissile = scan.nextInt();


        while (choixNbMissile > nbMissileMax){
            System.out.println("Votre vaisseau ne peut pas supporter plus de "+ this.nbMissileMax +" de missiles");

            System.out.println("Veuillez rentrer un nombre plus petit ");
            choixNbMissile = scan.nextInt();
        }
        this.nbMissile = choixNbMissile;
    }

    /*
     --------------------------------
     Methodes crées manuellement
    */

    public void ShowVaisseau(){
        System.out.println("\nVoici ton vaisseau");
        System.out.println("\n-------->" + this.getName() +"<---------" +"\nTu as "+this.getNbMissile() +"\t\\"+this.getNbMissileMax()
                +"\tmissiles en stock");
    }



    public void rechargerMissile(){
        int choix;
        System.out.println("il ne te reste plus que "+ this.nbMissile +"Missiles en stock");
       if (this.nbMissile < 3){
           System.out.println("Voulez vous recharger : \n1. Oui.\t\t2.Non");
           Scanner scan = new Scanner(System.in);
           choix = scan.nextInt();
           if (choix == 1){
               this.nbMissile += 10;
               System.out.println("Vous vous etes rechargé en missile.\nVous avez maintenant : \t" + this.nbMissile);
           }else {
               System.out.println("Pas de problème , il vous reste : " +this.nbMissile);
           }

       }
   }

    public void tirer( ){
        if ( this.nbMissile > 0){
            System.out.println("Boum" +"\tMissile largué");
            this.nbMissile--;
        }else {
            System.out.println("PiouPiou" +"\tPas de missile en stock ");
            rechargerMissile();
        }

    }
}
