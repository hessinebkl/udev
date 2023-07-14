package biblio;

public class LivreAudio extends Livre{
    private int duree;
    LivreAudio(String titre, String auteur, int anneeDePublication, boolean estEmprunte,int duree) {
        super(titre, auteur, anneeDePublication, estEmprunte);
        this.duree=duree;
    }
    
    // SETTERS
    public void setDuree(int duree){
        this.duree=duree;
    }
    //GETTERS
    public int getDuree(){
        return this.duree;
    }

}
