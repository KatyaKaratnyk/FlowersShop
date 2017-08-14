package com.butterfly;

import java.awt.*;

public class CactusLike extends FlowerAble {

    private FormPlant formCactus;
    private String name;
    CactusLike (){}

    CactusLike (NameCactus nameCactus, FormPlant formCactus, double priceCactus, Color colorCactus) {
        setName(nameCactus);
        setFormCactus(formCactus);
        setPrice(priceCactus);
        setColor(colorCactus);
    }

    public FormPlant getFormCactus() {
        return this.formCactus;
    }

    public void setFormCactus(FormPlant formCactus) {
        this.formCactus = formCactus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(NameCactus nameCactus) {
        this.name = nameCactus.toString();
    }

}
