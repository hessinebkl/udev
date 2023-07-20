package Biblio;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private String nom;
    private String adress;
    private int numeroDetelephone;
    private List<Livre> livresEmpruntes = new ArrayList<Livre>();

    // Constructeur
    Adherent(String nom,String adress, int numeroDetelephone){
        this.nom=nom;
        this.adress=adress;
        this.numeroDetelephone=numeroDetelephone;
    }

    //GETTERS
    public String getNom(){
        return this.nom;
    }
    public String getAdress(){
        return this.adress;
    }
    public int getnumeroDetelephone(){
        return this.numeroDetelephone;
    }
    public List<Livre> getLivres(){
        return this.livresEmpruntes;
    }

    //SETTERS
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public void setnumeroDetelephone(int numeroDetelephone){
        this.numeroDetelephone=numeroDetelephone;
    }

    //Method Emprunter Livre
    public void emprunterLivre(Livre livre){
        if(livresEmpruntes.size()>=2){
            System.out.println(getNom()+" Ne peut Emprunter plus de DEUX livres");
        }
        else{
            if(livre.getestEmprunter()){
            System.out.println(getNom()+" ne peut pas emprunter le livre < "+livre.getTitre() +
            " > parce que il est deja emprunté par un autre adherent");
            }
            else{
            livre.Emprunter();
            livresEmpruntes.add(livre);
            System.out.println("le livre < "+livre.getTitre()+" > a été Emprunte par "+getNom());
                }
        }
    }

    // Method Retourner Livre
    public void retournerLivre(Livre livre){
        if(livresEmpruntes.contains(livre)==false)
            System.out.println("le livre < "+livre.getTitre() +" > na pas été Emprunter par "+getNom());
        else{
            livre.Retourner();
            livresEmpruntes.remove(livre);
            System.out.println("le livre < "+livre.getTitre() +" > a été retourner par "+getNom());
        }
    }
}
