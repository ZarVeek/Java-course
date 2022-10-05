package java2.lesson5;

import java.util.*;


public class massive {
    private float[] randomGen(){
        Random rand = new Random();
        int size = 1_300_000;
        int s = size / 2;
        float[] arr = new float[size];
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < s; i++) {
                    arr[i] = rand.nextInt(6) + 1;
                }
            });
            Thread thread2 = new Thread(() -> {
                for (int j = s; j < size; j++) {
                    arr[j] = rand.nextInt(6) + 1;
                }
            });
        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }

    private void newMassive() throws InterruptedException {
        float[] array = randomGen();
        float[] a1 = new float[array.length / 2];
        float[] a2 = new float[array.length / 2];

        long a = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        long b = System.currentTimeMillis();
        System.arraycopy(array, 0, a1, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, a2, 0, array.length / 2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(a1, 0, array, 0, a1.length);
        System.arraycopy(a2, 0, array, a1.length, a1.length);
        System.out.println(System.currentTimeMillis() - b);
    }

    public static void main(String[] args) throws InterruptedException {
        massive Newmas = new massive();
        Newmas.newMassive();
    }
}
