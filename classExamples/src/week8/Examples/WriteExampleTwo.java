package week8.Examples;

import java.io.*;

public class WriteExampleTwo {

    public static void main(String[] args) {

        File file = new File("classExamples/src/week8/Examples/ex2.bin");

        try(OutputStream out = new BufferedOutputStream(new FileOutputStream(file))){

            for(int i = 0; i<5_000_000; i++){
                out.write(i);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
