package com.tarea.tarea2;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


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

        channelButton.setOnAction( e-> {
            sc.stop();
        });

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.getChildren().addAll(upView,channelButton,downView);
        BorderPane.setAlignment(vBox, Pos.BOTTOM_CENTER);
        setBottom(vBox);

    }
}
