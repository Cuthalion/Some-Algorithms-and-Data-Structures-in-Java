import java.util.Scanner;
public class Test2
{
       public static void main(String[] args)
       {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter postfix expression " +
                   "to evaluate or ctrl + z to exit:%n");

              while(input.hasNext())
              {
                    System.out.println("Enter postfix expression " +
                         "to evaluate postfixor ctrl + z to exit:%n");
                    String postfix = input.nextLine();
                    ParsePostfix parse = new ParsePostfix(postfix);
                    System.out.printf("Result of postfix expression is: %d%n"
                         ,parse.doParse());
              }
       }
}
