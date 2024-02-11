package com.example.javafxfirst;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEcentDemo extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Demonstration Button and Label");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,300,100);
        stage.setScene(myScene);
        response = new Label("Press a Button");
        Button btnA = new Button("Alpha");
        Button btnB = new Button("Beta");
        btnA.setOnAction((actionEvent)->response.setText("pressed was Alpha"));
        btnB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("pressed was Beta");
            }
        });
        rootNode.getChildren().addAll(btnA,response,btnB);
        stage.show();
    }

    public JavaFXEcentDemo() {
        super();
    }
}
