package com.example.javafxfirst;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DirectDrawDemo extends Application {
    GraphicsContext gc;
    Color[] colors = {Color.RED,Color.BLUE,Color.GREEN,Color.BLACK};
    int colorIndex = 0;
    public static void main(String[] args) {
        launch(args);
    }
    public DirectDrawDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("draw figure on Canvas");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,450,450);
        stage.setScene(myScene);
        Canvas myCanvas = new Canvas(400,400);
        gc = myCanvas.getGraphicsContext2D();
        Button bntChangeColor = new Button("Change Color");
        bntChangeColor.setOnAction((actionEvent)-> {
                gc.setStroke(colors[colorIndex]);
                gc.setFill(colors[colorIndex]);
                gc.strokeLine(0,0,200,200);
                gc.fillText("this is drawing on the canvas",60,50);
                gc.fillRect(100,320,300,40);
                colorIndex++;
                if(colorIndex == colors.length) colorIndex = 0;

        });
        gc.strokeLine(0,0,200,200);
        gc.strokeOval(100,100,200,200);
        gc.strokeRect(0,200,50,200);
        gc.fillOval(0,0,20,20);
        gc.fillRect(100,320,300,40);
        gc.setFont(new Font(20));
        gc.fillText("this is drawing on the canvas",60,50);
        rootNode.getChildren().addAll(myCanvas,bntChangeColor);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
