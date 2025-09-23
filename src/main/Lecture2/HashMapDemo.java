package main.Lecture2;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        hashMap();
    }

        public static void hashMap(){
            HashMap<String, String> firstHashMap = new HashMap<String, String>();
            System.out.println("Size of HashMap: " + firstHashMap.size());
            firstHashMap.put("DeniV", "Woman");
            firstHashMap.put("DeniB", "Woman");
            firstHashMap.put("Tedi", "Man");
            firstHashMap.put("Vidko", "Man");
            System.out.println("Size of HashMap, after adding elements: " + firstHashMap.size());
            firstHashMap.clear();
            System.out.println("Size of HashMap, after clear: " + firstHashMap.size());

            HashMap<String,Boolean> yesOrNoHashMap = new HashMap<String, Boolean>();
            yesOrNoHashMap.put("Is the course for Java?", true);
            yesOrNoHashMap.put("Is it with data?", false);
            yesOrNoHashMap.put("Is it for beginners?", true);
            yesOrNoHashMap.put("Is it long?", false);

            System.out.println("Get value for 'Is it for beginners?': " + yesOrNoHashMap.get("Is it for beginners?"));
            System.out.println("Get value for 'Is it long?': " + yesOrNoHashMap.get("Is it long?"));

            System.out.println("Get value for 'Is this My test': " + yesOrNoHashMap.getOrDefault("Is this My test", false));

            HashMap<Integer, String> foodMap = new HashMap<Integer, String>();
            foodMap.put(0, "Banana");
            foodMap.put(1, "Chips");
            foodMap.put(2, "Ice-Cream");
            foodMap.put(3, "Pasta");
            foodMap.put(4, "Bread");

            System.out.println("Food on key 2: " + foodMap.get(2));
            System.out.println("Replace key 2 Ice-Cream with Tomato");
            foodMap.replace(2,"Tomato");
            System.out.println("Food on key 2: " + foodMap.get(2));

            System.out.println("Food on key 4: " + foodMap.get(4));
            System.out.println("Replace key 4 Bread with Watermelon");
            foodMap.replace(4,"Bread", "Watermelon");
            System.out.println("Food on key 4: " + foodMap.get(4));

            System.out.println("Check if the foodmap has key 3: " + foodMap.containsKey(3));
            System.out.println("Check if the foodmap has the value banana: " + foodMap.containsValue("banana"));

            System.out.println(foodMap.values());
            foodMap.putIfAbsent(7,"Lemon");
            foodMap.putIfAbsent(3,"Milk");
            System.out.println(foodMap.values());
            System.out.println(foodMap.keySet());
            foodMap.remove(3);
            System.out.println(foodMap.values());
        }
    }