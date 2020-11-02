public abstract class Personne {
    public static String name;


    public Personne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void afficheCamps();
public abstract void combattre();
}
