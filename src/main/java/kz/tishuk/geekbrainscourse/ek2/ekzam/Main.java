package kz.tishuk.geekbrainscourse.ek2.ekzam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String str = in.nextLine();
            int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int jun = numArr[0];
            int senior = numArr[1];
            int mustLose = numArr[2];
            int ostatok = 0;
            if(jun%senior > 0) ostatok = 1;

            System.out.println(jun/senior*2 + ostatok);

        }
    }
}
