package week7;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteNumbers {
    public static void main(String[] args) {

        PrintWriter writer = null;

        try{
            writer = new PrintWriter("classExamples/src/week7/numbers.txt");
            for(int i = 0; i<10_000; i++){
                writer.println(i);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            if (writer!=null){
                writer.close();
            }
        }

    }
}
