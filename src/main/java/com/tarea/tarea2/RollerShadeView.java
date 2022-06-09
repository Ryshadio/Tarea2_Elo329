package com.tarea.tarea2;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, double length, double radius, Color color) {
        Image img = new Image(String.valueOf(Stage2.class.getResource("Cumple.png")));
        ImageView view = new ImageView(img);
        getChildren().add(view);
        cloth = new Rectangle (width,length);
        cloth.setFill(color);
        getChildren().add(cloth);

        // Rolled up shade cloth
        Ellipse rightSide = new Ellipse(width, radius,radius/2,radius);
        rightSide.setFill(color);
        rightSide.setStroke(Color.BLACK);
        getChildren().add(rightSide);
    }
    public void setLength(double length) {
        cloth.setHeight(length);
    }
    private Rectangle cloth;
}
