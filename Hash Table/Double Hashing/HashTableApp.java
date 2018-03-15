import java.util.Scanner;
import java.security.SecureRandom;

public class HashTableApp
{
       static Scanner input = new Scanner(System.in);
       static SecureRandom rand = new SecureRandom();

       public static void main(String[] args)
       {
              int n, size;
              int keysPerCell = 10;

              System.out.println("Enter the size of hash table: ");
              size = input.nextInt();
              System.out.println("Enter the initial number of items: ");
              n = input.nextInt();

              HashTable hashTable = new HashTable(size);

              for(int i = 0; i < n; i++)
              {
                    hashTable.insert(rand.nextInt(size * keysPerCell));
              }

              hashTable.displayHashTable();


       }
}
