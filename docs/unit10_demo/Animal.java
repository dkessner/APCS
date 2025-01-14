//
// Animal.java
//


public class Animal
{
    public Animal(String name, String type, int age, String color)
    {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getType() {return type;}
    public int getAge() {return age;}
    public String getColor() {return color;}

    private String name;
    private String type;
    private int age;
    private String color;
}


