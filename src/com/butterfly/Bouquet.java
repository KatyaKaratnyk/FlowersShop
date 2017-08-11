package com.butterfly;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

class Bouquet {
    ArrayList<Flowerable> flowers;
    Bouquet () {
        flowers = new ArrayList<Flowerable>();
    }

    public void addFlower(Flowerable myFlower) {
        flowers.add(myFlower);
    }
    public double priceBouquet() {

        double price =0;
        for (Flowerable e : flowers) {
            price = price+e.getPriceFlower();
        }
        return price;
    }

    public Flowers maxFlowerHeight() {
        Flowers flow = new Flowers();
        ArrayList<Flowers> bouquetWithoutCactus = new ArrayList<Flowers>();
        for (Flowerable e : flowers) {
            if (e.getClass().equals(Flowers.class)) {
                bouquetWithoutCactus.add((Flowers) e);
            }
        }
        for (Flowers e : bouquetWithoutCactus) {
            if (e.getHeightFlower() > flow.getHeightFlower()) {
                flow = e;
            }
        }
        return flow;
    }

    public long freshnessBouquet() {
        ArrayList<Flowers> bouquetWithoutCactus = new ArrayList<Flowers>();
        for (Flowerable e : flowers) {
            if (e.getClass().equals(Flowers.class)) {
                bouquetWithoutCactus.add((Flowers) e);
            }
        }
        long qtyDays = 0;
        for (Flowers e : bouquetWithoutCactus) {
            if(e.freshnessFlower()>qtyDays) {
                qtyDays = e.freshnessFlower();
            }
        }
        return qtyDays;
    }

    public void printFreshnessBouquet() {
        System.out.println("Freshness of the bouquet "+this.freshnessBouquet()+" days");
    }

    public void printMaxFlowerHeight() {
        System.out.println("The longest flower in your bouquet is: " + this.maxFlowerHeight().getNameFlower() + ". Its height is " + this.maxFlowerHeight().getHeightFlower() + " cm.");
    }

    public String find(String name) {
        String massage = "";
        for (Flowerable e : flowers) {
            if (e instanceof Flowers)
                if (((Flowers) e).getNameFlower().toString().compareToIgnoreCase(name)==0) {
                    massage = "There is a flower with that name in this bouquet";
                    break;
                } else massage = "There is no flower with that name in this bouquet";
            if (e instanceof CactusLike) {
                if (((CactusLike) e).getNameCactus().toString().compareToIgnoreCase(name)==0) {
                    massage = "There is a flower with that name in this bouquet";
                    break;
                } else massage = "There is no flower with that name in this bouquet";
            }
        }
        return massage;
    }

    public String find(double price) {
        String massage = "";
        for (Flowerable e : flowers) {
            if (e.getPriceFlower() == price) {
                massage = "There is a flower with that price in this bouquet";
                break;
            } else massage = "There is no flower with that price in this bouquet";
        }
        return massage;
    }

    public String find(Color color) {
        String massage = "";
        for (Flowerable e : flowers) {
            if (e.getColorFlower().equals(color)) {
                massage = "There is a flower with that color in this bouquet";
                break;
            } else massage = "There is no flower with that color in this bouquet";
        }
        return massage;
    }
}
