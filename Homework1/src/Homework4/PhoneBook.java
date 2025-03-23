package Homework4;

import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, Integer[]> directory = new HashMap<>();

    public void add(String lastName, Integer[] phoneNumbers) {
        directory.put(lastName, phoneNumbers);
    }

    public Integer[] get(String lastName) {
        return directory.get(lastName);
    }
}