package com.tarea.tarea2;
import java.util.ArrayList;

public class Cloud {
    public Cloud() {
        lamps = new ArrayList<Lamp>();
        rollers = new ArrayList<RollerShade>();
    }

    public void addLamp(Lamp l){ lamps.add(l); }

    public void addRollerShade(RollerShade rs){ rollers.add(rs); }

    public Lamp getLampAtChannel( int channel){
        for (Lamp l: lamps)
            if (l.getChannel() ==channel)
                return l;
        return null;
    }

    public RollerShade getRollerAtChannel( int channel){
        for (RollerShade rs: rollers)
            if (rs.getChannel() ==channel)
                return rs;
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

    public void startShadeUp(int Channel){
        RollerShade rs=getRollerAtChannel(Channel);
        if (rs != null) rs.startUp();
    }

    public void startShadeDown(int Channel){
        RollerShade rs=getRollerAtChannel(Channel);
        if (rs != null) rs.startDown();
    }

    public void stopShade(int Channel){
        RollerShade rs=getRollerAtChannel(Channel);
        if (rs != null) rs.stop();
    }

    private ArrayList<Lamp> lamps;
    private ArrayList<RollerShade> rollers;
}
