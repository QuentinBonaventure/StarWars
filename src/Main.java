public class Main {
    public static void main(String[] args) {
        Vaisseau vaisseauBase = new Vaisseau();

        vaisseauBase.setName();
        vaisseauBase.setNbMissile();
        vaisseauBase.ShowVaisseau();
        for (int i =0 ; i < 3;i++){
            vaisseauBase.tirer();

        }

    }
}
