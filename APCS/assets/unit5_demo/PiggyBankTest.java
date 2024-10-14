//
// PiggyBankTest.java
//


public class PiggyBankTest
{
    public static void main(String[] args)
    {
        // create (instantiate, construct) a new PiggyBank object
        PiggyBank bank = new PiggyBank();

        bank.addQuarter();
        bank.addQuarter();
        bank.addDime();
        bank.addDime();
        bank.addNickel();

        System.out.println("My total is:" + bank.getTotal());
        bank.addNickel();
        System.out.println("My total is:" + bank.getTotal());
    }
}


