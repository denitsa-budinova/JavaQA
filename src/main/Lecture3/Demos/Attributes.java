package main.Lecture3.Demos;

public class Attributes {

    public static void main(String[] args) {
        Cake vanillaCake = new Cake();
        System.out.println("My vanilla cake: " + vanillaCake);
        System.out.println("My cake's flavor is: " + vanillaCake.flavor);
        System.out.println("My cake's color is: " + vanillaCake.color);
        System.out.println("Is my cake decorated: " + vanillaCake.isDecorated);
        System.out.println("How many slices does my cake have: " + vanillaCake.sliceNumber);
        System.out.println("How many layers does my cake have: " + vanillaCake.layerNumbers);

        System.out.println("----------------------");

        vanillaCake.addFlavor("strawberry");

        System.out.println("My cake's flavor is: " + vanillaCake.flavor);

    }
}
