package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    Map<String, List<String>> phoneBook;
    List<String> phoneNumbers;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = new LinkedHashMap<>(map.size());
        this.phoneBook.putAll(map);
    }

    public PhoneBook() {
        this.phoneBook = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        this.phoneBook.put(name, this.phoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            this.phoneBook.put(name, Arrays.asList(phoneNumbers));
        }
    }

    public void remove(String name) {
        this.phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if(this.phoneBook.containsKey(name)){
            return true;
        }
        if(this.phoneNumbers.contains(name)){
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String returnString = "";
        Set<Map.Entry<String, List<String>>> setPhonebook = this.phoneBook.entrySet();
        for(Map.Entry<String, List<String>> i : setPhonebook){
            if(i.getValue().contains(phoneNumber))
                returnString = i.getKey();
        }
        return returnString;
    }

    public List<String> getAllContactNames() {
        Set<String> setPhonebook = this.phoneBook.keySet();
        List<String> returnNameList = Arrays.asList(setPhonebook.toArray(new String[0]));

        return returnNameList;
    }

    public Map<String, List<String>> getMap() {
        return this.phoneBook;
    }
}
