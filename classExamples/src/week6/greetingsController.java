package week6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class greetingsController {

    @FXML
    Button button;

    @FXML
    Label labelResponse;

    @FXML
    TextField textfieldUserEnter;




    @FXML
    public void buttonResponse(ActionEvent event){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("I Like Exams");
        alert.showAndWait();

    }


}
