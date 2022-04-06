package week5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ClickMe implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button button = (Button)actionEvent.getSource();
        button.setRotate(button.getRotate()+30);
    }
}
