package week5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonDriver extends Application {

    TextField tfName;
    Label lbResponse;

    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("Click me!");
        button.setAlignment(Pos.CENTER);
        //button.setOnAction(new ClickMe2());
        /*button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                Button button = (Button)actionEvent.getSource();
                button.setRotate(button.getRotate()+90);
            }
        });*/
        /*button.setOnAction(e -> {
            Button btn = (Button)e.getSource();
            btn.setRotate(btn.getRotate()+180);
        });*/
        //button.setOnAction(e -> handle2(e));
        //button.setOnAction(this::handle2);
        button.setOnAction(e->buttonResponse(e));

        tfName = new TextField();
        tfName.setOnAction(this::buttonResponse);

        lbResponse = new Label("");

        Pane pane = new VBox();
        pane.getChildren().addAll(tfName,button,lbResponse);

        Scene scene = new Scene(pane,400,400);

        stage.setScene(scene);

        stage.show();

    }

    private class ClickMe2 implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            Button button = (Button)actionEvent.getSource();
            button.setRotate(button.getRotate()+30);
        }
    }

    public void handle2(ActionEvent e){
        Button button = (Button)e.getSource();
        button.setRotate(button.getRotate()+30);
    }

    public void buttonResponse(ActionEvent e){
        String text = tfName.getText();
        lbResponse.setText("Hello " + text);
    }
}
