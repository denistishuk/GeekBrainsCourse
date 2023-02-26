package kz.tishuk.geekbrainscourse.lesson5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;
    public PhoneBook(Map<String, HashSet<String>> phoneBook) {
        this.phoneBook = new HashMap<>(phoneBook);
    }
    public PhoneBook(String surName, String phone) {
        phoneBook = new HashMap<>();
        phoneBook.put(surName, new HashSet<>());
        phoneBook.get(surName).add(phone);
    }
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String surName, String phone){
        if (!phoneBook.containsKey(surName)) {
            phoneBook.put(surName, new HashSet<>());
        }
        phoneBook.get(surName).add(phone);
    }
    public void add(Map<String, Set<String>> phoneBookAnother) {
        this.phoneBook.putAll(phoneBookAnother);
    }
    public Set<String> getPhone(String surName){
        return phoneBook.get(surName);
    }

    public Map<String, Set<String>> getAll() {
        return phoneBook;
    }
}
