package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public Bed(String style, int quilt, int sheets, int height, int pillows) {
        this.style = style;
        this.quilt = quilt;
        this.sheets = sheets;
        this.height = height;
        this.pillows = pillows;
    }
}
