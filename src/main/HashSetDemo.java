package main;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet();
    }

        public static void HashSet(){
            HashSet<String> foodMap = new HashSet<String>();

            System.out.println("Is Banana added to the foodmap hashSet?: " + foodMap.add("Banana"));
            System.out.println("Is Chips added to the foodmap hashSet?: " + foodMap.add("Chips"));
            System.out.println("Is Soda added to the foodmap hashSet?: " + foodMap.add("Soda"));
            System.out.println("Is Peanuts added to the foodmap hashSet?: " + foodMap.add("Peanuts"));
            System.out.println("Is Soda added to the foodmap hashSet?: " + foodMap.add("Banana"));

            System.out.println("The size of the foodmap is: " + foodMap.size());

            System.out.println("Is the foodmap empty?: " + foodMap.isEmpty());

            System.out.println("Remove Banana from he foodmap: " + foodMap.remove("Banana"));
            System.out.println("Remove Banana from he foodmap: " + foodMap.remove("Banana"));

            System.out.println("Remove all elements from the foodmap");
            foodMap.clear();
            System.out.println("The size of the foodmap is: " + foodMap.size());
            System.out.println("Is the foodmap empty?: " + foodMap.isEmpty());



        }
    }

