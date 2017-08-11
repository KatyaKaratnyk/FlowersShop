package com.butterfly;

import java.awt.*;

public class CactusLike implements Flowerable {

    private java.awt.Color colorCactus;
    private FormCactus formCactus;
    private double priceCactus;
    private NameCactus nameCactus;

    enum NameCactus {Cactus}
    enum FormCactus {Round, Square, Longitudinally}

    CactusLike (NameCactus nameCactus, FormCactus formCactus, double priceCactus, Color colorCactus) {
        setNameCactus(nameCactus);
        setFormCactus(formCactus);
        setPriceCactus(priceCactus);
        setColorCactus(colorCactus);
    }

    @Override
    public Color getColorFlower() {
        return this.colorCactus;
    }

    public void setColorCactus(Color colorCactus) {
        this.colorCactus = colorCactus;
    }

    @Override
    public double getPriceFlower() {
        return this.priceCactus;
    }

    public void setPriceCactus(double priceCactus) {
        this.priceCactus = priceCactus;
    }

    public FormCactus getFormCactus() {
        return this.formCactus;
    }

    public void setFormCactus(FormCactus formCactus) {
        this.formCactus = formCactus;
    }

    public NameCactus getNameCactus() {
        return this.nameCactus;
    }

    public void setNameCactus(NameCactus nameCactus) {
        this.nameCactus = nameCactus;
    }

}
