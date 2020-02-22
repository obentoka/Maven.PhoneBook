package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    Map<String, List<String>> phoneBook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        this.phoneBook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            this.phoneBook.get(name).add(phoneNumbers[i]);
        }
    }

    public void remove(String name) {
        this.phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
