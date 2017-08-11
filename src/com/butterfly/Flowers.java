package com.butterfly;

import java.awt.*;
import java.io.Closeable;
import java.time.LocalDate;
import java.util.zip.DataFormatException;

class Flowers implements Flowerable {
    private java.awt.Color colorFlower;
    private LocalDate dateOfCutting;
    private double heightFlower;
    private double priceFlower;
    private NameFlowers nameFlower;

    Flowers(){
    }


    Flowers(NameFlowers nameFlower, String dateOfCutting, double heightFlower, double priceFlower, Color colorFlower) {
        setNameFlower(nameFlower);
        setDateOfCutting(dateOfCutting);
        setHeightFlower(heightFlower);
        setPriceFlower(priceFlower);
        setColorFlower(colorFlower);
    }

    @Override
    public Color getColorFlower() {
        return this.colorFlower;
    }

    public void setColorFlower(Color colorFlower) {
        this.colorFlower = colorFlower;
    }

    public NameFlowers getNameFlower() {
        return this.nameFlower;
    }

    public void setNameFlower(NameFlowers nameFlower) {
        this.nameFlower = nameFlower;
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

    public long freshnessFlower()  {
            return LocalDate.now().toEpochDay() - this.getDateOfCutting().toEpochDay();
    }

    public double getHeightFlower() {
        return this.heightFlower;
    }

    public void setHeightFlower(double heightFlower) {
        this.heightFlower = heightFlower;
    }

    public double getPriceFlower() {
        return this.priceFlower;
    }

    public void setPriceFlower(double priceFlower) {
        this.priceFlower = priceFlower;
    }

    enum NameFlowers {Rose, Lily, Tulip, Orchid}

}