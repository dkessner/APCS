//
// Project.java
//


public class Project
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        CrazyPetOwner drkessner = new CrazyPetOwner();
        drkessner.addPet("Gadget", "meow", 5);
        drkessner.addPet("Tux", "sniff", 7);
        drkessner.addPet("Tum tum", "(bubbles)", 0);
        drkessner.addPet("Chuck", "bark", 10);
        drkessner.addPet("Marlow", "bark", 2);

        drkessner.greetPets();

        System.out.println("Flea density: " + drkessner.calculateFleaDensity());
    }
}


