package com.tarea.tarea2;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.application.Application;



public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl sc){

        ShadeControl shadeControl = sc;
        Button channelButton = new Button(""+sc.getChannel());

        Image up = new Image(String.valueOf(Stage1.class.getResource("Up.png")));
        ImageView upView = new ImageView(up);
        upView.setOnMouseClicked(mouseEvent -> sc.startUp());
        upView.setFitWidth(20);
        upView.setPreserveRatio(true);

        Image down = new Image(String.valueOf(Stage1.class.getResource("Down.png")));
        ImageView downView = new ImageView(down);
        downView.setOnMouseClicked(mouseEvent -> sc.startDown());
        downView.setFitWidth(20);
        downView.setPreserveRatio(true);

        Image right=new Image(String.valueOf((Stage1.class.getResource("Right.png"))));
        ImageView rightView = new ImageView(right);
        rightView.setOnMouseClicked(mouseEvent -> {
            shadeControl.changeChannel(3);
            channelButton.setText(""+sc.getChannel());
        });
        rightView.setFitWidth(20);
        rightView.setPreserveRatio(true);

        Image left=new Image(String.valueOf((Stage1.class.getResource("Left.png"))));
        ImageView leftView = new ImageView(left);
        leftView.setOnMouseClicked(mouseEvent -> {
            shadeControl.changeChannel(2);
            channelButton.setText(""+sc.getChannel());
        });
        leftView.setFitWidth(20);
        leftView.setPreserveRatio(true);

        channelButton.setOnAction( e-> {
            sc.stop();
        });



        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.getChildren().addAll(upView,downView,leftView,rightView,channelButton);
        BorderPane.setAlignment(vBox, Pos.BOTTOM_CENTER);
        setBottom(vBox);

    }
}
