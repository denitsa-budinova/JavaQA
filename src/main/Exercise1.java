package main;

import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap();
    }

    public static void HashMap(){
        HashMap<String, Integer> inventory = new HashMap<String, Integer>();
        //Add several products and their quantities
        inventory.put("Peaches", 30);
        inventory.put("Bananas", 15);
        inventory.put("Lemons", 35);
        inventory.put("Coconuts", 5);
        System.out.println("Store inventory: "+ inventory.entrySet());

        //Quantity of a specific product
        System.out.println("Bananas in the inventory: " + inventory.get("Bananas"));

        //Restock
        inventory.replace("Coconuts", 15);
        System.out.println("Coconuts in the inventory: " + inventory.get("Coconuts"));

        //Mark as Out of Stock
        inventory.replace("Bananas", 0);
        System.out.println("Bananas are out of stock");

        //Remove a product
        inventory.remove("Lemons");
        System.out.println("Store inventory: "+ inventory.entrySet());
    }
}
