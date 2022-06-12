

import javafx.scene.Group;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, double length, double radius, Color color, String root) {
        if(root!="") {
            Media ventana = new Media(root);
            MediaPlayer mediaPlayer1 = new MediaPlayer(ventana);
            mediaPlayer1.setAutoPlay(true);
            mediaPlayer1.setCycleCount(MediaPlayer.INDEFINITE);
            mediaPlayer1.volumeProperty().set(0);
            MediaView mediaView1 = new MediaView(mediaPlayer1);
            mediaView1.setFitHeight(maxLength);
            mediaView1.setPreserveRatio(true);
            getChildren().add(mediaView1);

        }else{
            Image img = new Image("/rsc/Cumple.png");
            ImageView imageView = new ImageView(img);
            getChildren().add(imageView);
        }
        cloth = new Rectangle(width, length);
        cloth.setFill(color);
        getChildren().add(cloth);

        // Rolled up shade cloth


        Ellipse rightSide = new Ellipse(width, radius,radius/2,radius);
        rightSide.setFill(color);
        rightSide.setStroke(Color.BLACK);
        getChildren().addAll(rightSide);
    }
    public void setLength(double length) {
        cloth.setHeight(length);
    }
    private Rectangle cloth;
}
