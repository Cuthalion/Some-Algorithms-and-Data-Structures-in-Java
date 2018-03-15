import java.security.SecureRandom;
public class App
{
       public static void main(String[] args)
       {
              SecureRandom rand = new SecureRandom();
              QuickSort2 arr = new QuickSort2(20);

              for(int i = 0; i < 20; i++)
                  arr.insert(i));
              arr.display();
              arr.quickSort();
              arr.display();
       }
}
