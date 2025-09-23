package main.Lecture3.Demos;

public class Cake {

    public Cake(){}

    String flavor = "vanilla";

    String color = "red";

    boolean isDecorated = true;

    int sliceNumber = 9;

    int layerNumbers = 2;

    //The keyword 'this' in Java is a reference to the current object of the class.

    public void addFlavor(String flavor){
        this.flavor = this.flavor + " and " + flavor;
    }

}