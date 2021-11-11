package ru.Lesson7_CatsAndFood;

import java.util.Random;
import java.util.Scanner;

public class FeedCats{


    public static void main(String[] args) {
        Cats[] cats = {
                new Cats("Мурзик", 5),
                new Cats("Барсик", 2),
                new Cats("Мурка", 7),
                new Cats("Дымка", 3),
                new Cats("Снежок", 6)
        };

        System.out.println("У нас есть три кота:" + cats[0].getName() + ", " + cats[1].getName() + ", " + cats[2].getName() + "\n");

        Plate plate = new Plate(new Random().nextInt(50 - 1) + 1);
        System.out.println(("В тарелке " + plate.getFood()) + "г корма" + "\n");


        for (Cats cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }


    }
}
