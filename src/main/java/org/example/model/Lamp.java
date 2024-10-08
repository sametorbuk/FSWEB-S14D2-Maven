package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {

    private boolean battery;
    private int globRating;
    private LampType style;



    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle(){
        return  this.style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
