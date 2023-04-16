package org.example.dataStructures;

import java.util.Scanner;

/**
 * R-1.10 Write a Java class, Flower, that has three instance variables of type String, int,
 * and float, which respectively represent the name of the flower, its number of
 * petals, and price. Your class must include a constructor method that initializes
 * each variable to an appropriate value, and your class should include methods for
 * setting the value of each type, and getting the value of each type.
 *
 * @author H. Doğukan Yılmaz
 */
public class Flower {

    //instance variable
    private String name;
    private int petals;
    private float price;

    //constructors
    public Flower(){

    }

    /**
     * Constructs a new flower instance
     * @param name the name of the flower (e.g.,"Rose")
     * @param petals the petals of the flower (e.g. 3)
     * @param price the price of the flower (measured dollars)
     */
    public Flower(String name,int petals,float price){
        this.name = name;
        this.petals = petals;
        this.price = price;
    }


    // access modifier
    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //methods

    public static void printFlowers(Flower flower){ //prints flower information
        System.out.println("Flower Information");
        System.out.println("------------------");
        System.out.println("Name: "+ flower.getName());
        System.out.println("Petals: "+ flower.getPetals()); //implicit casting
        System.out.println("Price: "+ flower.price); //implicit casting
        System.out.println("------------------");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flower[] flowers = new Flower[3];
        flowers[0] = new Flower("Rose",5,14.5F);
        flowers[1] = new Flower("Rose", 3,6.5F);
        flowers[2] = new Flower("Rose",14,27.3F);

        for (int i = 0; i < flowers.length; i++) {
            printFlowers(flowers[i]);
        }

    }

}
