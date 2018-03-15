import java.util.Scanner;

public class BracketCheckerApp
{

      public static void main(String[] args)
      {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the string to reverse or" +
                 "ctrl + z to exit");

            while(input.hasNext())
            {
                  String str = input.next();
                  BracketChecker obj = new BracketChecker(str);
                  if(obj.check())
                      System.out.println("There is no delimeter error in string.");
                  else
                      System.out.println("Delimeters don't match in string.");    
            }


      }
}
