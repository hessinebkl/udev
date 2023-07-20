package Biblio;
public class Main {
    public static void main(String[] args){

        Adherent A1 = new Adherent("M. Lahoucine", "fes",625302955);
        Adherent A2 = new Adherent("Mme. Jamila", "fes", 625987896);

        Livre L1 = new Livre("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, false);
        Livre L2 = new LivreAudio("Rage", "Richard Bachman", 1997, false,180);
        Livre L3 = new Livre("It Ends with Us", "Colleen Hoover", 2020, false);
        Livre L4 = new Livre("The Robe", "Lloyd Cassel Douglas", 1999, false);
        Livre L5 = new Livre("Shadows", "C. J. Box", 2022, false);

        Bibliotheque B = new Bibliotheque();

        B.ajouterLivre(L1);
        B.ajouterLivre(L2);
        B.ajouterLivre(L3);
        B.ajouterLivre(L4);
        B.ajouterLivre(L5);

    // LES TEST :

        // Test Emprunter Livre
        System.out.println(" ");
        A1.emprunterLivre(L1);
        A1.retournerLivre(L1);
        System.out.println(" ");

        // Test Emprunter un Livre Audio
        System.out.println(" ");
        A1.emprunterLivre(L2);
        A1.retournerLivre(L2);
        System.out.println(" ");

        // Imprimer un Livre
        System.out.println("  ");
        L1.Imprimer();
        System.out.println("  ");

        // Test de Emprenter un livre deja emprunter par un autre Adherent
        System.out.println(" ");
        A1.emprunterLivre(L4);
        A2.emprunterLivre(L4);
        A1.retournerLivre(L4);
        System.out.println(" ");

        // Test de routourner un livre qui n'a jamais été emprunté
        System.out.println(" ");
        A2.retournerLivre(L3);
        System.out.println(" ");

        // Test de routourne un livre déja Emprunter par un auter Adherent
        System.out.println(" ");
        A1.emprunterLivre(L5);
        A2.retournerLivre(L5);
        A1.retournerLivre(L5);
        System.out.println(" ");

        // Test de Emprenter plus de deux livres
        System.out.println(" ");
        A1.emprunterLivre(L1);
        A1.emprunterLivre(L2);
        A1.emprunterLivre(L3);
        System.out.println(" ");


    }
}
