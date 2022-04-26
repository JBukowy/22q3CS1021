package week8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {
    public static void main(String[] args) {

        File file = new File("classExamples/src/week8/binary.bin");

        try(FileOutputStream out = new FileOutputStream(file)){
            out.write(97);
        }catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}
