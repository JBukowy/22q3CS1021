import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class driver {
    public static void main(String[] args) {
        File file = new File("alphabet.txt");
        PrintWriter printer = null;


        try{
            printer = new PrintWriter(file);
            for(int i = 97; i < 97+26; i++){
                printer.println((char)i);
            }
        }catch(IOException e){
            System.out.println("There was an error writing to the file.");
        }finally{
            if(printer!=null){
                printer.close();
            }
        }
    }
}
