package ru.Lesson7_CatsAndFood;

import java.util.Random;
import java.util.Scanner;

public class FeedCats{


    public static void main(String[] args) {
        Cats[] cat = new Cats[3];
        cat[0] = new Cats("Барсик1", false, 10);
        cat[1] = new Cats("Барсик2", false, 20);
        cat[2] = new Cats("Барсик3", false, 30);

        System.out.println("У нас есть три кота:" + cat[0].getName() + ", " + cat[1].getName() + ", " + cat[2].getName() + "\n");

        Plate plate = new Plate(new Random().nextInt(50 - 1) + 1);
        System.out.println(("В тарелке " + plate.getFood()) + "г корма" + "\n");


        for (int i = 0; i < cat.length; i++) {
            System.out.println("Идёт кушать " + cat[i].getName());
            if (plate.getFood() >= cat[i].getAppetite()) {
                plate.decreaseFood(cat[i].getAppetite());
                cat[i].setSatiety(true);
                System.out.println( cat[i].getName() +" поел и тарелке осталось " + plate.getFood() + "г корма");
            }
            else {
                System.out.println(("В тарелке слишком мало еды для " + cat[i].getName()) + ". Хотите ли добавить корма? (да/нет)");
                Scanner scanner = new Scanner(System.in);

                if (scanner.nextLine().equals("да")) {
                    System.out.println("Сколько корма хотите добавить: ");
                    plate.increaseFood(scanner.nextInt());
                    System.out.println("Теперь в тарелке " + plate.getFood() + "г корма");
                    i--;
                }
                else if (scanner.nextLine().equals("нет"))
                    System.out.println(("Остальные котики остались без еды"));
                else
                    System.out.println(("Неизвестная команда"));

            }

        }

    }
}
