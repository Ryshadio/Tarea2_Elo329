

import javafx.scene.Group;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class LampView extends Group {
    public LampView () {
        Polygon base = new Polygon();
        base.getPoints().addAll(new Double[]{
                18d, 20d,
                18d, 50d,
                13d, 50d,
                10d, 53d,
                10d, 60d,
                30d, 60d,
                30d, 53d,
                27d, 50d,
                22d, 50d,
                22d, 20d});
        base.setFill(Color.BLACK);
        lampshade = new Polygon();
        lampshade.getPoints().addAll(new Double[]{
           10d,0d,
           30d,0d,
           40d,20d,
           0d,20d
        });
        lampshade.setFill(Color.BLACK);
        getChildren().addAll(base,lampshade);
    }
    public void setColor(short r, short g, short b){
        lampshade.setFill(Color.rgb(r,g,b));
    }
    private Polygon lampshade;
}
