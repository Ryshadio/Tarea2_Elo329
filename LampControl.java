
import javafx.scene.layout.Pane;

public class LampControl extends DomoticDeviceControl {
    public LampControl(int channel, Cloud c){
        super(channel,c);
        view = new LampControlView(this);
    }
    public void pressPower(){
        cloud.changeLampPowerState(this.getChannel());
    }
    public Pane getView() { return view;}
    public void setRed(short r){
        cloud.setRojo(r,getChannel());
    }
    public void setGreen(short g){
        cloud.setVerde(g,getChannel());
    }
    public void setBlue(short b){
        cloud.setAzul(b,getChannel());
    }
    public void changeCh(int ch){this.changeChannel(ch);}
    private Pane view;

}
