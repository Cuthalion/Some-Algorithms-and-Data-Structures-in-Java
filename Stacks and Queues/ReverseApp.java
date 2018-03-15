import java.util.Scanner;

public class ReverseApp
{

      public static void main(String[] args)
      {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the string to reverse or" +
                 "ctrl + z to exit");

            while(input.hasNext())
            {
                  String str = input.next();
                  Reverser obj = new Reverser(str);
                  System.out.printf("%s%n" , obj.reverse());
            }


      }
}
