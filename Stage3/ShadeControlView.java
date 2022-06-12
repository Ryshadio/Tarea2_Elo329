


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.application.Application;



public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl sc){

        ShadeControl shadeControl = sc;
        Button channelButton = new Button(""+sc.getChannel());

        Image up = new Image("/rsc/Up.png");
        ImageView upView = new ImageView(up);
        upView.setOnMouseClicked(mouseEvent -> sc.startUp());
        upView.setFitWidth(30);
        upView.setPreserveRatio(true);

        Image down = new Image("/rsc/Down.png");
        ImageView downView = new ImageView(down);
        downView.setOnMouseClicked(mouseEvent -> sc.startDown());
        downView.setFitWidth(30);
        downView.setPreserveRatio(true);

        Image right=new Image("/rsc/Right.png");
        ImageView rightView = new ImageView(right);
        rightView.setOnMouseClicked(mouseEvent -> {
            shadeControl.changeChannel(3);
            channelButton.setText(""+sc.getChannel());
        });
        rightView.setFitWidth(30);
        rightView.setPreserveRatio(true);

        Image left=new Image("/rsc/Left.png");
        ImageView leftView = new ImageView(left);
        leftView.setOnMouseClicked(mouseEvent -> {
            shadeControl.changeChannel(2);
            channelButton.setText(""+sc.getChannel());
        });
        leftView.setFitWidth(30);
        leftView.setPreserveRatio(true);

        channelButton.setOnAction( e-> {
            sc.stop();
        });


        GridPane pane = new GridPane();
        pane.prefHeight(100);
        pane.prefWidth(100);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);
        GridPane.setConstraints(upView,1,0);
        GridPane.setConstraints(channelButton,1,1);
        GridPane.setConstraints(downView,1,2);
        GridPane.setConstraints(leftView,0,1);
        GridPane.setConstraints(rightView,2,1);
        pane.getChildren().addAll(upView,downView,leftView,rightView,channelButton);

        BorderPane.setAlignment(pane, Pos.BOTTOM_CENTER);
        setBottom(pane);

    }
}
