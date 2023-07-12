package Persone;

public class CompteBancaire {
    private String titulaire;
    private float sold;

    CompteBancaire(String titulaire, float sold){
        this.titulaire = titulaire;
        this.sold = sold;
    }

    //getters

    public String getTitulaire(){
        return titulaire;
    }
     public float getSold(){
        return sold;
    }

    //setters

    public void setTitulaire(String titulaire){
        this.titulaire=titulaire;
    }
      public void setSold(float sold){
        this.sold=sold;
    }

    //fonction crediter
    
    public void crediter(float montant){
        this.sold = this.sold + montant;
    }

        //fonction debiter

    public void debiter(float montant){
        this.sold = this.sold - montant;
    }

    public void acheterVoiture(float prix){ 
        if (this.sold>prix)
        debiter(prix);
        else if (sold<prix)
        System.out.println("Votre sold est insuffisant a acheter cette voiture");
    }

    //afficherDetails
    public void afficherDetails(){
        System.out.println("Titulaire de compte: "+this.titulaire);
        System.out.println("Sold de compte: "+this.sold);
    }
}
