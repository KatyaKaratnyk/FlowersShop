package com.butterfly;

import java.awt.*;
import java.io.Closeable;
import java.time.LocalDate;
import java.util.zip.DataFormatException;

class Flowers extends FlowerAble {
    private LocalDate dateOfCutting;
    private double height;
    private String name;

    Flowers(){

    }
    Flowers(NameFlower nameFlower, String dateOfCutting, double heightFlower, double priceFlower, Color colorFlower) {
        setName(nameFlower);
        setDateOfCutting(dateOfCutting);
        setHeight(heightFlower);
        setPrice(priceFlower);
        setColor(colorFlower);
    }

    public String getName() {
        return this.name;
    }
    public void setName(NameFlower nameFlower) {
        this.name = nameFlower.toString();
    }

    public LocalDate getDateOfCutting() {

        return this.dateOfCutting;
    }

    public void setDateOfCutting(String dateOfCutting) {
        try {
            this.dateOfCutting = LocalDate.parse(dateOfCutting);
        }
        catch (java.time.format.DateTimeParseException e) {
            System.out.println("You entered the wrong date format. Try this one: \"yyyy-mm-dd\" ");
            System.exit(0);
        }
    }

    public long getFreshness()  {
        return LocalDate.now().toEpochDay() - this.getDateOfCutting().toEpochDay();
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double heightFlower) {
        this.height = heightFlower;
    }

    @Override
    public FormPlant getFormPlant() {
        return null;
    }
}