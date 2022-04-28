package week8.Examples;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExampleThree {

    public static void main(String[] args) {

        File file = new File("classExamples/src/week8/Examples/ex3.bin");

        try(DataOutputStream out = new DataOutputStream( new FileOutputStream(file))){

            for(int i = 70; i<90; i++){
                out.writeChar(i);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
