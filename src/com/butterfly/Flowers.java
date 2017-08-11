package com.butterfly;

import java.awt.*;
import java.time.LocalDate;

class Flowers implements Flowerable {
    private java.awt.Color colorFlower;
    private String dateOfCutting;
    private double heightFlower;
    private double priceFlower;
    private NameFlowers nameFlower;

    Flowers(){
        getHeightFlower();
        getPriceFlower();
        getDateOfCutting();
        getColorFlower();
        getNameFlower();

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

    public String getDateOfCutting() {
        return this.dateOfCutting;
    }

    public void setDateOfCutting(String dateOfCutting) {
        this.dateOfCutting = dateOfCutting;
    }

    public long freshnessFlower() {
        LocalDate dateFlower = LocalDate.parse(this.getDateOfCutting());
        LocalDate today = LocalDate.now();
        return today.toEpochDay() - dateFlower.toEpochDay();
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