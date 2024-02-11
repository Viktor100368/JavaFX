package com.example.javafxfirst;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application {
    ToggleButton tbOnOff;
    Label response;

    public static void main(String[] args) {
        launch(args);
    }
    public ToggleButtonDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Toggle Button ");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,220,120);
        stage.setScene(myScene);
        response = new Label("Push to button");
        tbOnOff = new ToggleButton("on/off");
        tbOnOff.setOnAction((actionEvent -> {
            if(tbOnOff.isSelected()) response.setText("Button is on");
            else response.setText("Button is off");
        }));
        rootNode.getChildren().addAll(tbOnOff,response);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
