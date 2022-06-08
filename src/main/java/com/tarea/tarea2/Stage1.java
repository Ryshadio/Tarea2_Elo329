package com.tarea.tarea2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Stage1 extends Application {
    public void start(Stage primaryStage) {
        int lampChannel=1;
        Cloud cloud = new Cloud();
        Lamp lamp = new Lamp(lampChannel);
        cloud.addLamp(lamp);
        LampControl lampControl = new LampControl(lampChannel, cloud);
        HBox root = new HBox(20);
        root.getChildren().addAll(lamp.getView(),lampControl.getView());
        root.setSpacing(100);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,500,300);
        primaryStage.setTitle("Domotic Devices Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}