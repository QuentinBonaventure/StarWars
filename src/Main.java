import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ScenarioBase [] menu = new ScenarioBase[]{
                new Scenario1()
        };
        Scanner scanner = new Scanner(System.in);
        String input = null;

        displayMenu(menu);
        input= scanner.nextLine();
        int choice = Integer.parseUnsignedInt(input)-1;
        if( choice< menu.length){
            menu[choice].run();
        }else{
            System.out.println(" l'action n'est pas au menu ");
        }
        displayMenu(menu);
        input = scanner.nextLine();


        }

    private static void displayMenu(ScenarioBase[] menu) {
        System.out.println();
        for (int i = 0; i < menu.length;i++){
            System.out.printf("-%d : %s%n" , i + 1 , menu[i].getName());
        }
        System.out.printf("- %s : %s%n", "q/Q","Quitter");
        System.out.printf("Choix :  ");
    }

}

