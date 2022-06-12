

public class DomoticDeviceControl {
    public DomoticDeviceControl(int ch, Cloud c){
        channel = ch;
        cloud = c;
    }
    public int getChannel() {
        return channel;
    }
    public void changeChannel(int ch){channel=ch;}
    protected Cloud cloud;
    private int channel;
}
