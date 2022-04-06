package week5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LeahDriver extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label leah = new Label("Hi, I am Leah the Label!");
        Label larry = new Label("Hi, I am larry the label - Leah's twin.");
        leah.setAlignment(Pos.CENTER);

        Button clickMe = new Button("Click me!");

        //Bucket!
        Pane pane = new VBox();
        pane.getChildren().addAll(leah,larry);

        Pane pane2 = new VBox();
        pane2.getChildren().add(clickMe);

        Pane bringThePain = new HBox();
        bringThePain.getChildren().addAll(pane,pane2);

        Scene scene = new Scene(bringThePain,400,400);

        stage.setScene(scene);

        stage.show();

    }
}
