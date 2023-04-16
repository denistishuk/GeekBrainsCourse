package kz.tishuk.geekbrainscourse.lesson6;

import java.util.Arrays;

public class MainApp {
    static final int SIZE = 1000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
       //method1();
       method2();
    }

    public static void method1() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        long timeWork = b - a;
        System.out.println("Время работы метода1: " + timeWork);
    }

    public synchronized static void method2() {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 3);
        long a = System.currentTimeMillis();
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread firstThread =  new Thread(() -> method3(arr1, 0));
        Thread secondThread = new Thread(() -> method3(arr2, HALF));
        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        long b = System.currentTimeMillis();
        long timeWork = b - a;
        System.out.println("Время работы метода2: " + timeWork);
    }

    private static void method3(float[] arr, int indexStart) {
        for(int i = 0, j = indexStart; i < arr.length; i++, j++ ){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }


}
