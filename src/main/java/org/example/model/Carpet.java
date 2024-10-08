package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.'");
    }

    public Carpet(int width, PaintColor color, int height) {
        this.width = width;
        this.color = color;
        this.height = height;
    }


    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
