
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;

import java.util.EventListener;

public class Lamp extends DomoticDevice {
    public Lamp (int channel){
        super(channel);
        r=g=b= 255;
        state = LampState.OFF;
        view = new LampView();
    }
    public void changePowerState(){
        state = state==LampState.ON ? LampState.OFF : LampState.ON;
        if (state==LampState.OFF) view.setColor((short)0,(short)0, (short)0);
        else view.setColor(r,g,b);
    }
    public void setRed(short r){
        this.r = r;
        if (state==LampState.ON) view.setColor(this.r,g,b);
    }
    public void setGreen(short g){
        this.g = g;
        if (state==LampState.ON)  view.setColor(r,this.g,b);
    }
    public void setBlue(short b){
        this.b = b;
        if (state==LampState.ON) view.setColor(r,g,this.b);
    }


    public Node getView() {
        return view;
    }
    private short r,g,b;
    private LampState state;
    private LampView view;


}