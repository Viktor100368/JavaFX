package com.example.javafxfirst;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {
    public JavaFXLabelDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
      FlowPane rootNode = new FlowPane();
      Scene myScene = new Scene(rootNode,300,200);
      stage.setScene(myScene);
      Label myLabel = new Label("it is my second Label");
      rootNode.getChildren().add(myLabel);
      stage.show();
















//        FlowPane rootNode = new FlowPane();
//        Scene myScene = new Scene(rootNode,300,200);
//        stage.setScene(myScene);
//        Label myLabel = new Label("This is a JavaFX label");
//        rootNode.getChildren().add(myLabel);
//        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
