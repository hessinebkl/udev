package Voiture;
public class Main{
    public static void main(String[] args){
        Voiture V1 = new Voiture("Volkswagen","Grey",180,150000);
        V1.afficherDetails();
        V1.setMarque("Volkswagen");;
        V1.setCouleur("Blue");
        V1.setVitesseMax(130);
        System.out.println("   ");
        V1.afficherDetails();
    }
}
