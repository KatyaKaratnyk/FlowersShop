package com.butterfly;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        Bouquet myBouquet = new Bouquet();
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Rose, "2017-01-05", 35.00, 0.99, Color.ORANGE));
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Lily, "2017-07-05", 35.001, 25.6, Color.PINK));
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Tulip, "2017-08-01", 35, 0.01, Color.CYAN));
        myBouquet.addFlower(new CactusLike(CactusLike.NameCactus.Cactus, CactusLike.FormCactus.Round, 34.2, Color.green));

        System.out.println(String.format("Price our bouquet = %.3f UAH ", myBouquet.priceBouquet()));

        myBouquet.printMaxFlowerHeight(); //Шукає найдовшу квітку в букеті

        myBouquet.printFreshnessBouquet(); //Визначає свіжість букету(за найстарішою квіткою в букеті)

        System.out.println(myBouquet.find("cactus")); //Пошук за назвою квітки в букеті

        System.out.println(myBouquet.find(34.2)); //Пошук за ціною в букеті

        System.out.println(myBouquet.find(Color.BLACK)); //Пошук за кольором в букеті
    }
}

