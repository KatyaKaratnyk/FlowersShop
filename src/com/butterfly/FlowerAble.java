package com.butterfly;

import java.awt.*;
import java.time.LocalDate;

public abstract class FlowerAble {
   private Color color;
   private double price;

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract String getName();
}