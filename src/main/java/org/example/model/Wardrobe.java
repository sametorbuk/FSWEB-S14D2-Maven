package org.example.model;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Wardrobe(int width, double weight, int height) {
        this.width = width;
        this.weight = weight;
        this.height = height;
    }


    public  void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }


}
