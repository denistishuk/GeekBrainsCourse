package kz.tishuk.geekbrainscourse.ekz4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int lengthStr = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

            Map<Integer, Set<Integer>> counter = new HashMap<>();
            int repeat = 0;
            int oldRepeat = 0;
            int index = 0;
/*
            for (int x : numArr) {
                int newValue = counter.getOrDefault(x, 0) + 1;
                if (newValue < oldRepeat) {
                    break;
                } else {
                    if (newValue > repeat) {
                        oldRepeat = repeat;
                        repeat = newValue;
                    }
                }
                counter.put(newValue, new HashSet<>());
                counter.get(newValue).add(x);
                index++;

                counter.remove(repeat);
                int countMap = 0; 
                for (Map.Entry<Integer, Set<Integer>> entry : counter.entrySet()) {
                    countMap++;
                    if (countMap > 1) {
                        System.out.println(index);
                    }
                }
            }
*/
            System.out.println(index);
        }
    }
//    private static
}
