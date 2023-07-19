package Biblio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Livre> livres = new ArrayList<Livre>();

    public void getBiblioLivresNumber() {
        System.out.println(livres.size());
    }

    public void ajouterLivre(Livre livre){
        livres.add(livre);
    }

    public void supprimerLivre(Livre livre){
        livres.remove(livre);
    }
}
