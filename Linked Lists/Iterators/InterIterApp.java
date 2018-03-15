import java.util.Scanner;

public class InterIterApp
{
       public static void main(String[] args)
       {
             Scanner input = new Scanner(System.in);
             LinkList list = new LinkList();
             ListIterator iter1 = list.getIterator();
             int value;

             iter1.insertAfter(20);
             iter1.insertAfter(50);
             iter1.insertBefore(40);
             iter1.insertBefore(30);

             while(true)
             {

                     System.out.println("Enter first letter of show, reset, "
                     + "next, get, before, after, delete: ");
                     int choice = input.next().charAt(0);

                     switch(choice)
                     {
                           case 's' :
                              if(!list.isEmpty())
                                  list.displayList();
                              else
                                  System.out.println("List is empty.");
                              break;
                           case 'r' :
                              iter1.reset();
                              break;
                           case 'n' :
                              if(!list.isEmpty() && !iter1.atEnd())
                                  iter1.nextLink();
                              else
                                  System.out.println("Can't go to next link");
                              break;
                           case 'g' :
                              if(!list.isEmpty())
                              {
                                  value = iter1.getCurrent().getData();
                                  System.out.println("Returned " + value);
                              }
                              else
                              {
                                  System.out.println("List is empty");
                              }
                              break;
                           case 'b' :
                               System.out.println("Enter value to insert before");
                               value = input.nextInt();
                               iter1.insertBefore(value);
                               break;
                           case 'a' :
                               System.out.println("Enter value to insert after");
                               value = input.nextInt();
                               iter1.insertAfter(value);
                               break;
                           case 'd' :
                               if(!list.isEmpty())
                               {
                                   value = iter1.deleteCurrent();
                                   System.out.println(value + "deleted");
                               }
                               else
                               {
                                   System.out.println("List is empty");
                               }
                               break;
                           case 'e' :
                                break;
                           default :
                               System.out.println("Invalid entry");
                     }

                     if(choice == 'e')
                         break;

               }
       }
}
