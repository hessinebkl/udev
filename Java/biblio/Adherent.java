package biblio;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private String nom;
    private String adress;
    private String numeroDetelephone;
    private List<String> livresEmpruntes = new ArrayList<String>();

    Adherent(String nom,String adress, String numeroDetelephone){
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
    public String getnumeroDetelephone(){
        return this.numeroDetelephone;
    }
     public List<String> getLivres(){
        return this.livresEmpruntes;
    }

    //SETTERS

    public void setNom(String nom){
        this.nom=nom;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public void setnumeroDetelephone(String numeroDetelephone){
        this.numeroDetelephone=numeroDetelephone;
    }

    //Methods

    public void emprunterLivre(Livre livre){
        if(livre.getestEmprunte()==true){
            System.out.println("ce livre "+livre.getTitre() +" est deja emprunte");
        }
        else{
            livre.emprunterLivre();
        }
    }

    public void retournerLivre(Livre livre){
        livresEmpruntes.remove(livre.getTitre());
    }

}
