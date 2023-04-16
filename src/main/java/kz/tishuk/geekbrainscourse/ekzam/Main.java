package kz.tishuk.geekbrainscourse.ekzam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String str = in.nextLine();
            int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            if(upStairs(numArr) || downStairs(numArr)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    private static boolean downStairs(int[] numArr) {
        int max = 300;
        for (int num : numArr) {
            if ((num - max) <= 0){
                max = num;
            } else return false;
        }
        return true;
    }

    private static boolean upStairs(int[] numArr) {
        int min = 0;
        for (int num : numArr) {
            if ((num - min) >= 0){
                min = num;
            } else return false;
        }
        return true;
    }
}
