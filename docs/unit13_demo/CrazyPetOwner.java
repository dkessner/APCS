//
// CrazyPetOwner.java
//


import java.util.*;


public class CrazyPetOwner
{
    public CrazyPetOwner()
    {
        pets = new ArrayList<Pet>();
    }

    public void addPet(String name, String noise, int fleaCount)
    {
        pets.add(new Pet(name, noise, fleaCount));
    }

    public void greetPets()
    {
        for (Pet p : pets)
        {
            System.out.println("Hello " + p.getName() + "!" + 
                    "  " + p.getNoise());
        }
    }

    public double calculateFleaDensity()
    {
        // average # of fleas / pet

        double result = 0;
        
        for (Pet p : pets)
        {
            result += p.getFleaCount();
        }

        return result / pets.size();
    }

    private ArrayList<Pet> pets;
}


