package java2.lesson1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Player[] players = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Barrier[] barriers = {
                new Treadmill(7),
                new Wall(2),
                new Treadmill(14),
                new Wall(4)
        };

        for (Barrier barrier : barriers) {
            for (Player player : players) {
                barrier.overcome(player);
            }

        }

        System.out.println("Победители:");
        for (Player player : players) {
            if (player.isPlayer()){
                System.out.println(player);
            }
        }
    }

}
