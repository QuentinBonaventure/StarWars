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

    public void ShowName(){
        System.out.println("\nVoici ton vaisseau");
        System.out.println("\n-------->" + this.getName() +"<---------");
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    public void setNbMissile(int nbMissile) {
        this.nbMissile = nbMissile;
    }

    public void recharger(){
       if (this.nbMissile < 3){
           System.out.println("Voulez vous recharger");
           Scanner scan = new Scanner(System.in);

       }
   }

    public void tirer( ){
        if ( this.nbMissile > 0){
            System.out.println("Boum" +"\tMissile largué");
            this.nbMissile--;
        }else {
            System.out.println("PiouPiou" +"\tPas de missile en stock ");
        }
    }
}
