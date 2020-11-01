import java.util.Scanner;

public class Vaisseau {

  public  String name;
   public int nbMissile;
   private boolean enVol = false;


    public String getName() {
        return this.name;
    }

    public void setName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quel nom veux tu donner à ton vaisseau");
        this.name = scan.nextLine();

    }

    public void ShowVaisseau(){
        System.out.println("\nVoici ton vaisseau");
        System.out.println("\n-------->" + this.getName() +"<---------" +"\nTu as "+this.getNbMissile() +"\tmissiles en stock");
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    public void setNbMissile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Combien veux tu mettre de missile dans ton vaisseau ");
        this.nbMissile = scan.nextInt();
    }

    public void recharger(){
        int choix;
        System.out.println("il ne te reste plus que "+ this.nbMissile +"Missiles en stock");
       if (this.nbMissile < 3){
           System.out.println("Voulez vous recharger : \n1. Oui.\t\t2.Non");
           Scanner scan = new Scanner(System.in);
           choix = scan.nextInt();
           if (choix == 1){
               this.nbMissile += 10;
               System.out.println("Vous");
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
        }
        recharger();
    }
}
