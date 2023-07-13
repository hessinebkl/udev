package Inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("lahoucine.txt");
            writer.write("Hello, my name is Lahoucine");
            writer.close();

            FileReader reader = new FileReader("lahoucine.txt");
            int text;
            while((text = reader.read()) != -1) {
                System.out.print((char) text);


            }
            reader.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
