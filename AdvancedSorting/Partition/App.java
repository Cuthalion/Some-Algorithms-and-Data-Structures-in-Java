import java.security.SecureRandom;
public class App
{
      public static void main(String[] args)
      {
             SecureRandom rand = new SecureRandom();
             Partition p1 = new Partition(10);

             for(int i = 0; i < 10; i++)
                  p1.insert(rand.nextInt(100));


             int pivot = rand.nextInt(100);
             System.out.printf("Partition is %d with pivot %d%n",
                  p1.partition(10, pivot), pivot);
             p1.display();
      }
}
