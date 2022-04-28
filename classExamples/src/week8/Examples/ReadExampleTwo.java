package week8.Examples;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExampleTwo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        List<Integer> numbers = new ArrayList<>();

        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(null);

        try(FileInputStream in = new FileInputStream(file)) {
            int read;

            do{
                read = in.read();
                if(read!=-1){
                    numbers.add(read);
                }
            }while(read!=-1);
        }catch(IOException e){
            System.out.println(e.getMessage());
    }

        System.out.println(numbers);
}



}
