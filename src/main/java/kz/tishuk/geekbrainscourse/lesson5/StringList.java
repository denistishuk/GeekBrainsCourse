package kz.tishuk.geekbrainscourse.lesson5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringList {
    public static void main(String[] args) {
        String[] listStr = new String[]{"Дом", "Сом", "Гном", "Гром", "Мама", "Папа", "Денис", "Дом", "Кит", "Сом",};
        getUnicWordsAndCountHashMap(listStr);
    }
    public static void getUnicWordsAndCount(String[] words) {
        // 1 способ
        Set<String> stringSet = new HashSet<>(List.of(words));
        int count = 0;
        for (String str : stringSet) {
            for (String elAr : words) {
                if (str.equals(elAr)) {
                    count++;
                }
            }
            System.out.println("\"" + str + "\"" + " встречается " + count + " раз");
            count = 0;
        }
    }

    public static void getUnicWordsAndCountHashMap(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : words){
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
