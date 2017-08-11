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
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Rose, "2017-01-01", 35.00, 0.99, Color.ORANGE));
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Lily, "2017-07-05", 35.001, 0.01, Color.PINK));
        myBouquet.addFlower(new Flowers(Flowers.NameFlowers.Tulip, "2017-08-01", 35, 0.01, Color.CYAN));
        myBouquet.addFlower(new CactusLike(CactusLike.NameCactus.Cactus, CactusLike.FormCactus.Round, 0.0, Color.green));

        System.out.println("price our bouquet =  "+ myBouquet.priceBouquet()+" UAH");

        myBouquet.printMaxFlowerHeight(); //Шукає найдовшу квітку в букеті

        myBouquet.printFreshnessBouquet(); //Визначає свіжість букету(за найстарішою квіткою в букеті)

        System.out.println(myBouquet.find("cactus")); //Пошук за назвою квітки в букеті

        System.out.println(myBouquet.find(34.999999999999)); //Пошук за ціною в букеті

        System.out.println(myBouquet.find(Color.BLACK)); //Пошук за кольором в букеті
    }
}

