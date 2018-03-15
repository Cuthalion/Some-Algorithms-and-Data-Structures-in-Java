public class HashTable
{
       private SortedList[] hashArray;
       private int arraySize;

       public HashTable(int arraySize)
       {
             this.arraySize = arraySize;
             hashArray = new SortedList[arraySize];
             for(int i = 0; i < arraySize; i++)
                  hashArray[i] = new SortedList();
       }

       public int hashFunc(int key)
       {
             return key % arraySize;
       }

       public void insert(int key)
       {
             int hashVal = hashFunc(key);
             hashArray[hashVal].insert(key);
       }

       public void delete(int key)
       {
             int hashVal = hashFunc(key);
             hashArray[hashVal].delete(key);
       }

       public Link find(int key)
       {
             int hashVal = hashFunc(key);
             return hashArray[hashVal].find(key);
       }

       public void displayTable()
       {
             for(int i = 0; i < arraySize; i++)
             {
                   System.out.printf("%d. list ", i);
                   hashArray[i].displayList();
             }
       }
}
