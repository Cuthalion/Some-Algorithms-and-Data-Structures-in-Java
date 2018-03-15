public class HashTable
{
       DataItem[] hashArray;
       int arraySize;
       DataItem nonItem;

       public HashTable(int arraySize)
       {
              this.arraySize = arraySize;
              hashArray = new DataItem[arraySize];
              nonItem = new DataItem(-1);
       }

       public int hashFunc(int key)
       {
              return key % arraySize;
       }

       public void insert(int key)
       {
              DataItem item = new DataItem(key);
              int hashVal = hashFunc(key);

              while(hashArray[hashVal] != null &&
                   hashArray[hashVal].getKey() != -1)
              {
                   ++hashVal;
                   hashVal %= arraySize;
              }

              hashArray[hashVal] = item;
       }

       public DataItem delete(int key)
       {
              int hashVal = hashFunc(key);

              while(hashArray[hashVal] != null)
              {
                    if(hashArray[hashVal].getKey() == key)
                    {
                          DataItem temp = hashArray[hashVal];
                          hashArray[hashVal] = nonItem;
                          return temp;
                    }

                     ++hashVal;
                     hashVal %= arraySize;
              }

              return null;
       }

       public DataItem find(int key)
       {
              int hashVal = hashFunc(key);

              while(hashArray[hashVal] != null)
              {
                    if(hashArray[hashVal].getKey() == key)
                         return hashArray[hashVal];
                    ++hashVal;
                    hashVal %= arraySize;
              }

              return null;
       }

       public void displayHashTable()
       {
              int displayCount = 0;

              for(int i = 0; i < arraySize; i++)
              {
                    if(hashArray[i].getKey() != -1)
                    {
                         if(displayCount++ % 5 == 0)
                              System.out.println();
                         if(hashArray[i] == null);
                              System.out.print("*** ");
                         else
                              System.out.print(hashArray[i].getKey() + " ");
                    }
              }
       }
}
