package Biblio;

public class Livre implements Imprimable{
    private String titre;
    private String auteur;
    private int anneeDePublication;
    private boolean estEmprunte;

    // Constructeur
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

    // Method Emprunter Livre
    public void Emprunter(){
        this.estEmprunte = true;
    }

    // Method Retourner Livre
    public void Retourner(){
        this.estEmprunte = false;
    }

    // Method Imprimer
    @Override
    public void Imprimer() {
        System.out.println("Impression: ");
        System.out.println("Titre: "+this.titre);
        System.out.println("Auteur: "+this.auteur);
        System.out.println("Année de Publication: "+this.anneeDePublication);
    }

}
