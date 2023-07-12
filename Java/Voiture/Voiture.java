package Voiture;
public class Voiture{
    private String marque;
    private String couleur;
    public float prix;
    private int vitessemax;

    //Constructeurs
    Voiture(String marque, String couleur, int vitessemax, float prix){
        this.marque=marque;
        this.couleur=couleur;
        this.vitessemax=vitessemax;
    }

    //Setters
    public void setMarque(String marque){
        this.marque = marque;
    }
    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
    public void setVitesseMax(int vitessemax){
        this.vitessemax = vitessemax;
    }
    public void setPrix(float prix){
        this.prix = prix;
    }

    //Getters
    public String getMarque(){
        return marque;
    }
    public String getCouleur(){
        return couleur;
    }
    public Integer getVitesseMax(){
        return vitessemax;
    }
     public Float getPrix(){
        return prix;
    }

    //Affichage
    public void afficherDetails(){
        System.out.println("Marque: "+this.marque);
        System.out.println("Couleur: "+this.couleur);
        System.out.println("Vitesse Max: "+this.prix);
        System.out.println("Vitesse Max: "+this.vitessemax);
        System.out.println("Prix: "+this.prix);
    }
}


