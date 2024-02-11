package com.example.javafxfirst;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonImageDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch();
    }
    public ButtonImageDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Button Image");
        FlowPane rootNode = new FlowPane(10,10);
        Scene myScene = new Scene(rootNode,250,450);
        stage.setScene(myScene);
        response = new Label("push a button");
        Button btnAnalogClock = new Button("Analog Clock",
                new ImageView("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock (1).png"));
        Button btnHourGlass = new Button("Hour Glass",
                new ImageView("C:\\Users\\Victor\\Documents\\picture\\tutti-hourglass (1).png"));
        btnAnalogClock.setContentDisplay(ContentDisplay.TOP);
        btnHourGlass.setContentDisplay(ContentDisplay.TOP);
        btnAnalogClock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("Analog Clock pressed");
            }
        });
        btnHourGlass.setOnAction((actionEvent -> response.setText("Hour Class pressed")));
        rootNode.getChildren().addAll(btnAnalogClock,btnHourGlass,response);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
