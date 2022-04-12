package week6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        String response = textfieldUserEnter.getText();
        labelResponse.setText(response);
    }


}
