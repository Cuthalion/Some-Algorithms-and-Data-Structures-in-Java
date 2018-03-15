import java.util.Scanner;
import java.security.SecureRandom;

public class HashTableApp
{
       static Scanner input = new Scanner(System.in);
       static SecureRandom rand = new SecureRandom();

       public static void main(String[] args)
       {
              int aKey;
              int n, size, keysPerCell;

              System.out.println("Enter the size of hash table:");
              size = input.nextInt();
              System.out.println("Enter the initial size of hash table:");
              n = input.nextInt();
              keysPerCell = 100;
              HashTable hashTable = new HashTable(size);

              for(int i = 0; i < n; i++)
                    hashTable.insert(rand.nextInt(size * keysPerCell));
              System.out.println("Enter first letter of show, insert," +
                    "delete, find, or ctrl + z to exit.");

              while(input.hasNext())
              {
                    char choice = input.next().charAt(0);  

                    switch(choice)
                    {
                          case 's':
                                hashTable.displayTable();
                                break;
                          case 'i':
                                System.out.println("Enter the key to insert:");
                                aKey = input.nextInt();
                                hashTable.insert(aKey);
                                break;
                          case 'd':
                                System.out.println("Enter the key to delete:");
                                aKey = input.nextInt();
                                hashTable.delete(aKey);
                                break;
                          case 'f':
                                System.out.println("Enter the key to find:");
                                aKey = input.nextInt();
                                hashTable.find(aKey);
                                break;
                          default:
                                System.out.println("Invalid entry.");
                                break;
                    }

                    System.out.println("Enter first letter of show, insert," +
                     "delete, find, or ctrl + z to exit.");

              }
       }
}
