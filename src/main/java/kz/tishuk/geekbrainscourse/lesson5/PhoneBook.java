package kz.tishuk.geekbrainscourse.lesson5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phoneBook;
    public PhoneBook(Map<String, String> phoneBook) {
        this.phoneBook = new HashMap<>(phoneBook);
    }
    public PhoneBook(String surName, String phone) {
        phoneBook = new HashMap<>();
        phoneBook.put(phone, surName);
    }
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String surName, String phone){
        phoneBook.put(phone, surName);
    }
    public void add(Map<String, String> phoneBook) {
        this.phoneBook.putAll(phoneBook);
    }
    public void get(String surName){
        if(phoneBook.containsValue(surName)) {
            for (HashMap.Entry<String, String> pair : phoneBook.entrySet()) {
                String phone = pair.getKey();
                String name = pair.getValue();
                if (name.equals(surName)) {
                    System.out.println(surName + " - номер телефона " + phone);
                }
            }
        } else {
            System.out.println("Данной фамилии не существует");
        }
    }
}
