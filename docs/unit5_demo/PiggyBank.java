//
// PiggyBank.java
//


public class PiggyBank
{
    public PiggyBank()  // note: constructor has no return type
    {
        total = 0;
    }

    public void addQuarter()
    {
        total += 25;
    }

    public void addDime()
    {
        total += 10;
    }

    public void addNickel()
    {
        total += 5;
    }

    public int getTotal()
    {
        return total;
    }

    private int total;
}


