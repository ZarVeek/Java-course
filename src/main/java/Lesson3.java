import sun.awt.windows.WPrinterJob;

import java.util.Random;

public class Lesson3 {

    public static void main(String[] args) {
        mass();
        emptyMass();
        massX2();
        square();
        lenInitialValue(5, 10);
        maxAndMin();
        checkBalance(new int[]{1, 1, 1, 2, 1});
    }

    public static void mass() {
        int[] a = new int[] {1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                System.out.print(a[i]+" ");
            } else {
                a[i] = 0;
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("\n");
    }
    public static void emptyMass(){
        int[] empty = new int[100];

        for (int i = 0; i < empty.length; i++){
            empty[i] = i+1;
            System.out.print(empty[i] + " ");
        }
        System.out.println("\n");
    }

    public static void massX2(){
        int[] mass = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6){
                mass[i] *= 2;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    public static void square(){
        int[][] square = new int[5][5];
        int dig = 0;
        int dig2 = -1;

        for (int i = 0; i < square.length; i++) {
            System.out.println();
            dig++;
            dig2++;
            for (int j = 0; j < square.length; j++){
                if(j==i)
                    System.out.print(" 1");
                else if(j == square.length-dig && i == dig2){
                    System.out.print(" 1");
                }
                else
                    System.out.print(" 0");

            }
        }
        System.out.println("\n");
    }

    public static void lenInitialValue(int len, int initialValue){
        int[] mass = new int[len];

        for (int i = 0; i < mass.length; i++){
            mass[i] = initialValue;
            System.out.print(mass[i] + " ");
        }
        System.out.println("\n");
    }

    public static void maxAndMin(){
        Random random = new Random();
        int[] maxAndMin = new int[]{random.nextInt(10+5)-5, random.nextInt(10+5)-5, random.nextInt(10+5)-5, random.nextInt(10+5)-5};
        for (int j : maxAndMin) {
            System.out.print(j + " ");
        }
        int max = maxAndMin[0], min = maxAndMin[0];

        for (int i : maxAndMin) {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }
        System.out.printf("\nmin = %d Max = %d", min, max);
        System.out.println("\n");
    }
    static boolean checkBalance(int[] array){
        int leftSum;
        int rightSum;

        for (int i = 0; i < array.length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += array[j];
            }

            for (int k = i + 1; k < array.length; k++) {
                rightSum += array[k];
            }
            System.out.print(leftSum + " ");
            System.out.print(rightSum + " ");
            System.out.println();
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}


