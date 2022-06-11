package com.tarea.tarea2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class Stage3 extends Application {
    public void start(Stage primaryStage) {
        int lampChannel=2;
        int lampChannel2=3;
        Cloud cloud = new Cloud();
        Lamp lamp = new Lamp(lampChannel);
        cloud.addLamp(lamp);
         LampControl lampControl = new LampControl(lampChannel, cloud);
        Lamp lamp2 = new Lamp(lampChannel2);
        cloud.addLamp(lamp2);
        LampControl lampControl2 = new LampControl(lampChannel2, cloud);



        HBox hBox = new HBox(20);
        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.CENTER);



        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20));
        pane.setBottom(hBox);



        hBox.getChildren().addAll(lamp.getView(), lamp2.getView());
        hBox.getChildren().add( lampControl.getView());


        int shadeChannel=2;
        RollerShade rs = new RollerShade(shadeChannel, 4, 150, 100,"");
        cloud.addRollerShade(rs);
        pane.setLeft(rs.getView());
        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.BOTTOM_RIGHT);


        ShadeControl shadeControl = new ShadeControl(shadeChannel,cloud);
        hBox.getChildren().add(0,shadeControl.getView());
        hBox.setSpacing(50);
        Scene scene = new Scene(pane, 500, 400);


        primaryStage.setTitle("Domotic Devices Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

