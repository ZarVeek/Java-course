package java2.lesson6v2;

import java.util.Arrays;

public class main {
    public static final int SIZE = 3_000_000;
    public static final int chunkCount = 8;

    public static void main(String[] args) {
        final main app = new main();
        float[] arr = new float[SIZE];
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 1f);
        app.run(arr);
        final long t1 = System.currentTimeMillis() - start;
        System.out.println("Время работы в один паток - " + t1);

        Arrays.fill(arr, 1f);
        start = System.currentTimeMillis();
        app.runWithTreads(arr);
        final long t2 = System.currentTimeMillis() - start;
        System.out.printf("Время работы в %d патоков: %d \n", chunkCount, t2);

        System.out.println("отношение - " + t1/t2);
    }

    private void run(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private void runWithTreads(float[] arr){
        int chunkSize = arr.length / chunkCount;
        float[][] chunks = new float[chunkCount][chunkSize];
        Thread[] t = new Thread[chunkCount];
        for (int i = 0, c = 0; i < arr.length; i+=chunkSize, c++) {
            chunks[c] = Arrays.copyOfRange(arr, i, Math.min(arr.length, i+chunkSize));
            final int j = c;
            t[c] = new Thread(() -> run(chunks[j]));
            t[c].start();
        }
        
        for (int i = 0; i < chunkCount; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0, c = 0; i < arr.length; i+=chunkSize, c++) {
            System.arraycopy(chunks[c], 0, arr, i, chunks[c].length);
        }

    }
}
