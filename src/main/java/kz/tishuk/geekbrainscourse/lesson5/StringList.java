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

    public static void getUnicWordsAndCountHashMap(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : words){
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
