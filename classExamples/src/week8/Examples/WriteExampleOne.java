package week8.Examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExampleOne {

    public static void main(String[] args) {

        File file = new File("classExamples/src/week8/Examples/ex1.bin");

        try(FileOutputStream out = new FileOutputStream(file)){

            for(int i = 250; i<270; i++){
                out.write(i);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
