package Throw;

public class Test {

    public void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Accés refusé - Vous devez avoir au moins 18 ans.");
        }
        else{
        System.out.println("Accés accordé - Vous avez l'age requis.");
        }
    }

    public static void main(String[] args){
        Test test = new Test();
        try {
            test.checkAge(15);
        } catch (ArithmeticException e) {
             System.out.println("Exception capturée: "+e.getMessage());
        } finally{
             System.out.println("Le bloc finnaly est exécuté.");
        }
    }
}
