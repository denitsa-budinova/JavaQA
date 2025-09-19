package main;

import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        HashSet();
    }

    public static void HashSet() {
        HashSet<String> guestList = new HashSet<String>();

        //Add guests
        guestList.add("Tom");
        guestList.add("Ben");
        guestList.add("Stacy");
        guestList.add("Robert");
        guestList.add("Elizabeth");

        //See the initial guest list
        System.out.println("Initial guest list: " + guestList);

        //Try to add a duplicate
        System.out.println("Adding the same guest: " + guestList.add("Ben"));

        //Remove a guest
        guestList.remove("Stacy");

        //Check if a guest is on the list
        System.out.println("Is Stacy still on the list? " + guestList.contains("Stacy"));

        //Final guest list
        System.out.println("Final guest list: " + guestList);
    }
}