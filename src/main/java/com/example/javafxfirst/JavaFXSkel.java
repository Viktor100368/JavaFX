package com.example.javafxfirst;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Запуск Java-FX пршложения");
        launch(args);
    }
    public JavaFXSkel() {
        super();
    }

    @Override
    public void start(Stage stage)  {
        System.out.println("В теле метода start()");
        stage.setTitle("JavaFX Skeleton");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode,300,200);
        stage.setScene(myScene);
        stage.show();
    }

    @Override
    public void init()  {
        System.out.println("В теле метода init()");
    }

    @Override
    public void stop()  {
        System.out.println("В теле методв stop()");
    }
}
