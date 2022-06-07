package com.tarea.tarea2;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {
        Image img = new Image(String.valueOf(Stage1.class.getResource("ONOFF.png")));
        ImageView view = new ImageView(img);
        view.setFitWidth(60);
        view.setPreserveRatio(true);
        Slider slider1 = new Slider(0,255,0);
        Slider slider2 = new Slider(0,255,0);
        Slider slider3 = new Slider(0,255,0);
        getChildren().addAll(view,slider1,slider2,slider3);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10.0);

    }

}
