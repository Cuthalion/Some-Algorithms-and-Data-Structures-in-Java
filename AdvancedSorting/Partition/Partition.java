public class Partition
{
      int[] array;
      int numberOfElements;

      public Partition(int maxSize)
      {
            array = new int[maxSize];
            numberOfElements = 0;
      }

      public void insert(int value)
      {
            array[numberOfElements++] = value;
      }

      public int size()
      {
            return numberOfElements;
      }

      public void display()
      {
            for(int elem : array)
                 System.out.printf("%d ", elem);
            System.out.println();
      }

      public int partition(int pivot)
      {
            int leftPtr = -1;
            int rightPtr = size();

            while(true)
            {
                  while(leftPtr < (size() - 1) && array[++leftPtr] <= pivot);

                  while(rightPtr > 0 && array[--rightPtr] >= pivot);

                  if(leftPtr >= rightPtr)
                      break;
                  swap(leftPtr, rightPtr);
            }

            return leftPtr;
      }

      public void swap(int index1, int index2)
      {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
      }
}
