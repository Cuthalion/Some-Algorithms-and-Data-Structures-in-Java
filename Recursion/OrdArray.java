public class OrdArray
{
      int numberOfElements;
      int[] array;

      public OrdArray(int maxSize)
      {
            numberOfElements = 0;
            array = new int[maxSize];
      }

      public int getSize()
      {
            return numberOfElements;
      }

      public int find(int searchKey)
      {
            return recBinarySeach(0, numberOfElements - 1, searchKey);
      }

      public void insert(int key)
      {
            int i;
            for(i = 0; i < numberOfElements; i++)
                if(array[i] > key)
                     break;

            for(int j = numberOfElements; j > i; j--)
                array[j] = array[j - 1];
            array[i] = key;
            numberOfElements++;
      }

      public int recBinarySeach(int lowerBound, int upperBound, int searchKey)
      {
            int current = (lowerBound + upperBound) / 2;
            if(array[current] == searchKey)
                 return current;
            else if(lowerBound > upperBound)
                 return numberOfElements;
            else
                if(array[current] > searchKey)
                    return recBinarySeach(lowerBound, current - 1, searchKey);
                else
                    return recBinarySeach(current + 1, upperBound, searchKey);
      }

      public void displayArray()
      {
            for(int i = 0; i < numberOfElements; i++)
                 System.out.printf("%d ", array[i]);
      }
}
