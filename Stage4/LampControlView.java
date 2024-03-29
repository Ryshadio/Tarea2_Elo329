
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {

        Image img = new Image("/rsc/ONOFF.png");
        ImageView view = new ImageView(img);
        view.setFitWidth(60);
        view.setPreserveRatio(true);
        view.setOnMouseClicked(mouseEvent -> lampControl.pressPower());
        Spinner <Integer> sp=new Spinner<Integer>(2,3,1);

        Slider slider1 = new Slider(0,255,0);
        Label red = new Label("R",slider1);
        slider1.setValue(255);

        Slider slider2 = new Slider(0,255,0);
        slider2.setValue(255);
        Label green = new Label("G",slider2);

        Slider slider3 = new Slider(0,255,0);
        slider3.setValue(255);
        Label blue = new Label("B",slider3);

        getChildren().addAll(view,red,green,blue,slider1,slider2,slider3,sp);

        this.setAlignment(Pos.CENTER);
        this.setSpacing(10.0);

        sp.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                int current=sp.getValue();
                if(current==2){
                    lampControl.changeChannel(current);
                }
                if(current==3){
                    lampControl.changeChannel(current);
                }
            }
        });

        slider1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                lampControl.setRed((short)slider1.getValue());
            }
        });

        slider2.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                lampControl.setGreen((short)slider2.getValue());
            }
        });

        slider3.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                lampControl.setBlue((short)slider3.getValue());
            }
        });
    }
}