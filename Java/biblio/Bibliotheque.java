package biblio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<String> livres = new ArrayList<String>();

    public void ajouterLivre(Livre livre){
        livres.add(livre.getTitre());
    }

    public void supprimerLivre(Livre livre){
        livres.remove(livre.getTitre());
    }
}
