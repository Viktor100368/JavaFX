package com.example.javafxfirst;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LabelImageDemo extends Application {
    public static void main(String[] args) {
        launch();
    }
    public LabelImageDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Display an Image");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,900,700);
        stage.setScene(myScene);
        Image image = new Image("C:\\Users\\Victor\\Documents\\ViberDownloads\\111.jpg");
        ImageView newImage = new ImageView(image);
        Label imageLabel = new Label("Кактус",newImage);
        imageLabel.setContentDisplay(ContentDisplay.RIGHT);
        rootNode.getChildren().add(imageLabel);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
