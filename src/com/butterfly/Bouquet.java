package com.butterfly;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

class Bouquet<T extends FlowerAble> {
    ArrayList<T> bouquet;
    Bouquet () {
        bouquet = new ArrayList<>();
    }

    public void addFlower(T myFlower) {
        bouquet.add(myFlower);
    }
    public double priceBouquet() {

        double price =0;
        for (FlowerAble e : bouquet) {
            price = price+e.getPrice();
        }
        return price;
    }


    public double maxFlowerHeight() {
        double max = 0;
        for (FlowerAble e : bouquet) {
            if(e.getHeight()>max) max = e.getHeight();
        }
        return max;
    }

    public long freshnessBouquet() {
        long days = 0;
        for (FlowerAble e : bouquet) {
            if(e.getFreshness()>days) days = e.getFreshness();
        }
        return days;
    }

    public void printFreshnessBouquet() {
        System.out.println("Freshness of the bouquet "+this.freshnessBouquet()+" days");
    }

    public void printMaxFlowerHeight() {
        System.out.println("The longest flower in your bouquet has: " + this.maxFlowerHeight() + " cm.");
    }

    public String find(String name) {
        String message = "";
        for (FlowerAble e : bouquet) {
            if (e.getName().compareToIgnoreCase(name) == 0) {
                message = "There is a flower with that name in this bouquet";
                break;
            } else message = "There is no flower with that name in this bouquet";
        }
        return message;
    }


    public String find(double price) {
        String message = "";
        for (FlowerAble e : bouquet) {
            if (e.getPrice() == price) {
                message = "There is a flower with that price in this bouquet";
                break;
            } else message = "There is no flower with that price in this bouquet";
        }
        return message;
    }

    public String find(Color color) {
        String massage = "";
        for (FlowerAble e : bouquet) {
            if (e.getColor().equals(color)) {
                massage = "There is a flower with that color in this bouquet";
                break;
            } else massage = "There is no flower with that color in this bouquet";
        }
        return massage;
    }
}
