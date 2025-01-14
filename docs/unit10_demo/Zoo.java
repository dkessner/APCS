//
// Zoo.java
//


import java.util.*;


public class Zoo
{
    // print stuff

    public static void printAnimals(ArrayList<Animal> animals)
    {
        for (Animal a : animals)
            System.out.println(a.getName() + " is a " + a.getColor()
                    + " " + a.getType());
    }

    // calculation

    public static double averageAge(ArrayList<Animal> animals)
    {
        double sum = 0;

        for (Animal a : animals)
        {
            sum += a.getAge();
        }

        return sum / animals.size();
    }

    // filter

    public static ArrayList<Animal> getDogs(ArrayList<Animal> animals)
    {
        ArrayList<Animal> dogs = new ArrayList<Animal>();

        for (Animal a : animals)
        {
            if (a.getType().equals("dog"))
                dogs.add(a);
        }

        return dogs;
    }

    // transform

    public static ArrayList<String> getNames(ArrayList<Animal> animals)
    {
        ArrayList<String> result = new ArrayList<String>();

        for (Animal a : animals)
        {
            result.add(a.getName());
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, zoo!");

        ArrayList<Animal> animals = new ArrayList<Animal>(); 

        animals.add(new Animal("Gadget", "cat", 5, "black and white"));
        animals.add(new Animal("Tux", "cat", 5, "black and white"));
        animals.add(new Animal("Tum tum", "turtle", 10, "green and red"));
        animals.add(new Animal("Marlow", "dog", 6, "brown"));
        animals.add(new Animal("Meimei", "dog", 1, "white"));

        printAnimals(animals);

        System.out.println("average age: " + averageAge(animals));

        ArrayList<Animal> dogs = getDogs(animals);
        System.out.println("dogs:");
        printAnimals(dogs);

        System.out.println("names:");
        ArrayList<String> names = getNames(animals);
        for (String name : names)
            System.out.println(name);
    }

}


