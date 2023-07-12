package Persone;

public class Person {
        private String nom;
        private int age;
        private String adresse;
        private CompteBancaire cb;

        //Constructeurs
        Person(String nom, int age, String adresse,CompteBancaire cb){
            this.nom= nom;
            this.age= age;
            this.adresse= adresse;
            this.cb = cb;

        }
    
        //Setters
        public void setNom(String nom){
            this.nom = nom;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setAdresse(String adresse){
            this.adresse = adresse;
        }
    
        //Getters
        public String getNom(){
            return this.nom;
        }
        public Integer getAge(){
            return age;
        }
        public String getAdresse(){
            return adresse;
        }

        
        public void acheterVoiture(float prix){ 
            if (cb.getSold()>prix)
            cb.debiter(prix);
            else if (cb.getSold()<prix)
            System.out.println("Votre sold est insuffisant a acheter cette voiture");  
        }
        //Affichage
        public void sePresenter(){
            System.out.println("Nome: "+this.nom);
            System.out.println("Age: "+this.age);
            System.out.println("Adresse: "+this.adresse);
        }
}
