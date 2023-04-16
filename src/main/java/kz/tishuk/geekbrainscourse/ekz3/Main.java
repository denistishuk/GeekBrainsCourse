package kz.tishuk.geekbrainscourse.ekz3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try (Scanner in = new Scanner(System.in)) {
            int lengthStr = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            String[] strArr = str.split("");

            for(int i = 0; i < lengthStr ; i++) {
                for (int j = lengthStr - i; j > 0; j--){
                    String newStr = str.substring(i, i + j);
                    if(containsStr(newStr)) {
                        map.put(newStr, newStr.length());
                    }
                }

            }
            Map.Entry<String, Integer> minEntry = null;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                    minEntry = entry;
                }
            }
            System.out.println(minEntry.getValue());
        }
    }

    private static boolean containsStr(String newStr) {
        return newStr.contains("a") && newStr.contains("b") && newStr.contains("c") && newStr.contains("d");
    }
}
