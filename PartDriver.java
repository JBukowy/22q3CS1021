package week10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PartDriver {


    public static void main(String[] args) {

        File in = new File("partexamples.txt");

        List<Part> out = listToList(in);

        for(Part p: out){
            p.printBillOfMaterials();
        }

    }


    static List<Part> listToList(File list){

        List<String> fileContents = new ArrayList<>();
        List<Part> tempList = new ArrayList<>();

        try{
            fileContents = Files.readAllLines(list.toPath());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        for(String s: fileContents){
            Part temp = null;

            String[] components = s.split("\\s+");

            if(components[0].equals("Nut")){
                tempList.add(new Nut(Double.parseDouble(components[1])));
            }else if(components[0].equals("Bolt")){
                tempList.add(new Bolt(Double.parseDouble(components[1]),
                        Double.parseDouble(components[2])));
            }
        }

        return tempList;
    }

}
