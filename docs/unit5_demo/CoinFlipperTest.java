//
// CoinFlipperTest.java
//


public class CoinFlipperTest
{
    public static void main(String[] args)
    {
        CoinFlipper coin = new CoinFlipper();
        
        for (int i=0; i<5; i++)
            System.out.println(coin.flip());
    }
}


