package biblio;

public class Livre implements Imprimable{
    private String titre;
    private String auteur;
    private int anneeDePublication;
    private boolean estEmprunte;

    Livre(String titre, String auteur, int anneeDePublication, boolean estEmprunte){
        this.titre=titre;
        this.auteur=auteur;
        this.anneeDePublication=anneeDePublication;
        this.estEmprunte=estEmprunte;
    }

    // SETTERS
    public void setTitre(String titre){
        this.titre=titre;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }
    public void setanneeDePublication(int anneeDePublication){
        this.anneeDePublication=anneeDePublication;
    }

    //GETTERS
    public String getTitre(){
        return this.titre;
    }
      public String getauteur(){
        return this.auteur;
    }
      public int getanneeDePublication(){
        return this.anneeDePublication;
    }
      public boolean getestEmprunte(){
        return this.estEmprunte;
    }

    
    public void emprunterLivre(){
        this.estEmprunte = true;
    }

    public void retournerLivre(){
        this.estEmprunte = false;
    }

    @Override
    public void imprimer() {
        System.out.println("Livre est Imprimé");
    }

}
