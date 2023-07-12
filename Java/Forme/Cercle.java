package Forme;

public class Cercle extends Forme {
    double r;

    Cercle(double r){
        this.r=r;
    }

    
    @Override
    void aire() {
        double aire = Math.PI*r*r;
        System.out.println("aire de cercle est: "+aire);
    }


}
