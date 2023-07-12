package Forme;

public class Carre extends Forme{
    double a;

    Carre(double a){
        this.a=a;
    }

    @Override
    void aire(){
        double aire = a*a;
        System.out.println("aire de carre est: "+aire);
    }    
}
