package biblio;

public class Main {
    public static void main(String[] args){

        Adherent A1 = new Adherent("lahoucin", "fes", "0625302955");
        Adherent A2 = new Adherent("otman", "fes", "0623651478");
        Adherent A3 = new Adherent("issam", "fes", "0625987896");

        Livre L1 = new Livre("rich dad poor dad", "Robert Kiyosaki", 1997, false);
        Livre L2 = new Livre("Rage", "Richard Bachman", 1997, false);
        Livre L3 = new Livre("It Ends with Us", "Colleen Hoover", 2020, false);
        Livre L4 = new Livre("The robe", "Lloyd Cassel Douglas", 1999, false);
        Livre L5 = new Livre("Shadows", "C. J. Box", 2022, false);

        Bibliotheque B = new Bibliotheque();

        B.ajouterLivre(L1);
        B.ajouterLivre(L2);
        B.ajouterLivre(L3);
        B.ajouterLivre(L4);
        B.ajouterLivre(L5);

        A1.emprunterLivre(L5);
        A2.emprunterLivre(L5);




    }
}
