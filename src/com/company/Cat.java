package com.company;

import java.util.Scanner;

public class Cat {

    private int legs;
    private boolean fur;
    private String color;
    private Scanner input = new Scanner(System.in);


    // Constructor
    public Cat(int legs, boolean fur, String color) {
        // constructor setting the value for each variable
        this.legs = legs;
        this.fur = fur;
        this.color = color;
    }
    // Getters and setters
    public int getLegs() {

        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
