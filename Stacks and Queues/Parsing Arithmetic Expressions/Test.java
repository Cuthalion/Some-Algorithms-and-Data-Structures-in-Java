import java.util.Scanner;
public class Test
{
       public static void main(String[] args)
       {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter infix expression " +
                   "to convert postfix or ctrl + z to exit:%n");

              while(input.hasNext())
              {
                    System.out.println("Enter infix expression " +
                         "to convert postfixor ctrl + z to exit:%n");
                    String infix = input.nextLine();
                    InfixToPostfix convert = new InfixToPostfix(infix);
                    System.out.printf("Postix expression is: %s%n"
                         ,convert.toPostfix());
              }
       }
}
