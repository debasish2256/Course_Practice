package Feb21;
public class Coin
{

   // constant to represent heads
   private static int TAILS = 1;

   // current value of the coin
   private int value = 0;

   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return true if the value is heads or false otherwise
   public boolean isTails()
   {
      return value == TAILS;
   }

   // convert the value to a string
   public String toString()
   {
      if (value == TAILS) return "Tails";
      else return "Heads";
   }

   // test the class
   public static void main(String[] args)
   {

      Coin myCoin = new Coin();
      for (int i = 0; i < 10; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isTails());
      }
   }
}

