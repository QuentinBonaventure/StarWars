import personnages.Citoyen;
import personnages.Personne;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Vaisseau vaisseauBase = new Vaisseau();
        Personne.name ="xWing";
        Citoyen citoyen = new Citoyen(Personne.name);

        vaisseauBase.setName();

        vaisseauBase.setNbMissile();

        vaisseauBase.ShowVaisseau();
        vaisseauBase.tirer();
        vaisseauBase.voler();
        vaisseauBase.atterir();

        citoyen.afficheCamps();



        }

    }

