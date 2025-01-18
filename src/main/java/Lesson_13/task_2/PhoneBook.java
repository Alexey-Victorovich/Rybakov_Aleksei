package main.java.Lesson_13.task_2;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }

    public void remove(String surname, String phoneNumber) {
        List<String> phones = phoneBook.get(surname);
        if (phones != null) {
            phones.remove(phoneNumber);
            if (phones.isEmpty()) {
                phoneBook.remove(surname);
            }
        }
    }

    public void update(String surname, String oldPhoneNumber, String newPhoneNumber) {
        List<String> phones = phoneBook.get(surname);
        if (phones != null) {
            int index = phones.indexOf(oldPhoneNumber);
            if (index != -1) {
                phones.set(index, newPhoneNumber);
            }
        }
    }

    public void printPhones(String surname) {
        System.out.println("Телефоны " + surname + "ых:");
        for (String phoneNumber : get(surname)) {
            System.out.println(phoneNumber);
        }
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Телефоны " + entry.getKey() + "ых:");
            for (String phoneNumber : entry.getValue()) {
                System.out.println(phoneNumber);
            }
        }
    }
}