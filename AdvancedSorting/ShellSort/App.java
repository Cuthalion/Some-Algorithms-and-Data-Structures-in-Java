import java.security.SecureRandom;
public class App
{
       public static void main(String[] args)
       {
             SecureRandom rand = new SecureRandom();

             ArrayShell arr = new ArrayShell(50);

             for(int i = 0; i < 50; i++)
                   arr.insert(rand.nextInt(999));

             arr.shellSort();
             arr.display();       

       }
}
