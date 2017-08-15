package com.butterfly;

import java.awt.*;
import java.time.LocalDate;

public class CactusLike extends FlowerAble {

    private FormPlant formCactus;
    private String name;

    CactusLike() {
    }

    CactusLike(NameCactus nameCactus, FormPlant formCactus, double priceCactus, Color colorCactus) {
        setName(nameCactus);
        setFormPlant(formCactus);
        setPrice(priceCactus);
        setColor(colorCactus);
    }

    public FormPlant getFormPlant() {
        return this.formCactus;
    }

    public void setFormPlant(FormPlant formCactus) {
        this.formCactus = formCactus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(NameCactus nameCactus) {
        this.name = nameCactus.toString();
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public LocalDate getDateOfCutting() {
        return null;
    }

    @Override
    public long getFreshness() {
        return 0;
    }
}
