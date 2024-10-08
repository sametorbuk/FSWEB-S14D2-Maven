package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom(
                "Yatak Odası",
                new Wall("Sağ"),
                new Wall("Sol"),
                new Wall("Ön"),
                new Wall("Arka"),
                new Ceiling(3, PaintColor.RED),
                new Bed("2 kişilik", 2, 3, 1, 3),
                new Lamp(LampType.NORMAL, true, 5),
                new Wardrobe(4, 5.2, 3),
                new Carpet(3, PaintColor.GREEN, 5)
        );
}


}