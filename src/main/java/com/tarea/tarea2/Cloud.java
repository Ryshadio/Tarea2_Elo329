package com.tarea.tarea2;
import java.util.ArrayList;

public class Cloud {
    public Cloud() {
        lamps = new ArrayList<Lamp>();
    }
    public void addLamp(Lamp l){
        lamps.add(l);
    }
    public Lamp getLampAtChannel( int channel){
        for (Lamp l: lamps)
            if (l.getChannel() ==channel)
                return l;
        return null;
    }
    public void changeLampPowerState(int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changePowerState();
    }
    public void setRojo(short r, int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.setRed(r);
    }
    public void setVerde(short g, int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.setGreen(g);
    }
    public void setAzul(short b, int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.setBlue(b);
    }
    private ArrayList<Lamp> lamps;
}
