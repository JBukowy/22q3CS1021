package week7;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner reader = null;

        try{
            //reader = new Scanner(Paths.get("classExamples/src/week7/numbers.txt"));
            reader = new Scanner(Paths.get("numbers.txt"));
            while(reader.hasNextLine()){
                numbers.add(Integer.parseInt(reader.nextLine()));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            if(reader!=null){
                reader.close();
            }
        }

        int sum = 0;
        for(Integer i: numbers){
            sum += i;
        }

        System.out.println(sum);

    }
}
