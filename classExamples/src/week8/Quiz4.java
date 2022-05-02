package week8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Quiz4 {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(23);
        num.add(1_000_000);

        File file = new File("quizdemo.bin");

        writeNumbers(file,num);

        List<Integer> collect = new ArrayList<>();

        try(DataInputStream in = new DataInputStream(new FileInputStream(file))){

            collect.add((int)in.readLong());

            for(int i = 0; i<3; i++){
                collect.add(in.read());
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(collect);

    }




    public static void writeNumbers(File file, List<Integer> numbers){

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file))){

            out.writeLong(numbers.size());

            for(Integer i: numbers){
                out.write(i);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
