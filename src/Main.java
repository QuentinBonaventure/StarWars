import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Vaisseau vaisseauBase = new Vaisseau();

        vaisseauBase.setName();

        vaisseauBase.setNbMissile();

        vaisseauBase.ShowVaisseau();
        vaisseauBase.tirer();
        vaisseauBase.voler();
        vaisseauBase.atterir();



        }

    }

