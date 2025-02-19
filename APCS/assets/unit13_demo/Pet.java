//
// Pet.java
//


public class Pet
{
    public Pet(String name, String noise, int fleaCount)
    {
        this.name = name;
        this.noise = noise;
        this.fleaCount = fleaCount;
    }

    public String getName() {return name;}
    public String getNoise() {return noise;}
    public int getFleaCount() {return fleaCount;}

    private String name;
    private String noise;
    private int fleaCount;
}


