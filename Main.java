package Persone;

public class Main {
    public static void main(String[] args){

        CompteBancaire cb = new CompteBancaire("Lahoucine", 200000);
        Voiture vt = new Voiture("Passat", "Grey", 180, 90000);
        Person P1 = new Person("Lahoucine", 25, "fes", cb);

        P1.sePresenter();
        cb.afficherDetails();
        vt.afficherDetails();

        System.out.println("   ");

        P1.acheterVoiture(150000);
        vt.setMarque("BMW");

        P1.sePresenter();
        cb.afficherDetails();
        vt.afficherDetails();

    }
}
