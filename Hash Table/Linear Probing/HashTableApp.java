import java.util.Scanner;
import java.security.SecureRandom;

public class HashTableApp
{
       private static Scanner input = new Scanner(System.in);
       private static SecureRandom secureRandom = new SecureRandom();

       public static void main(String[] args)
       {
              DataItem aDataItem;
              int size, n, keysPerCell;

              System.out.println("Enter the size of hash table:");
              size = input.nextInt();
              System.out.println("Enter the initial number of items:");
              n = input.nextInt();
              keysPerCell = 10;
              HashTable hashTable = new HashTable(size);

              for(int i = 0; i < n; i++)
              {
                     hashTable.insert(
                          secureRandom.nextInt(keysPerCell * size));
              }

              hashTable.displayHashTable();

       }
}
