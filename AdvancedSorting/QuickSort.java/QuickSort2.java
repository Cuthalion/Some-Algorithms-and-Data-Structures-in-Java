public class QuickSort2
{
      int[] array;
      int numberOfElements;

      public QuickSort2(int maxSize)
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

      public void quickSort()
      {
           recQuickSort(0, size() - 1);
      }

      private void recQuickSort(int left, int right)
      {
           int size = right - left + 1;

           if(size <= 3)
               manualSort(left, right);
           else
           {
              int median = medianOf3(left, right);
              int partition = partitionIt(left, right, median);

              recQuickSort(left, partition - 1);
              recQuickSort(partition + 1, right);
           }
      }

      private int partitionIt(int left, int right, int pivot)
      {
           int leftPtr = left;
           int rightPtr = right - 1;

           while(true)
           {
                 while(array[++leftPtr] < pivot);

                 while(array[--rightPtr] > pivot);

                 if(leftPtr >= rightPtr)
                      break;

                 swap(leftPtr, rightPtr);
           }

           swap(leftPtr, right - 1);
           return leftPtr;
      }

      private int medianOf3(int left, int right)
      {
            int center = (left + right) / 2;

            if(array[left] > array[center])
                swap(left, center);

            if(array[left] > array[right])
                swap(left, right);

            if(array[center] > array[right])
                swap(center, right);

            swap(center, right - 1);
            return array[right - 1];
      }

      private void manualSort(int left, int right)
      {
            int size = right - left + 1;

            if(size <= 1)
                return;

            if(size == 2)
            {
                if(array[left] > array[right])
                    swap(left, right);
                    return;
            }

            if(size == 3)
            {
                 if(array[left] > array[right - 1])
                      swap(left, right - 1);

                 if(array[left] > array[right])
                      swap(left, right);

                 if(array[right - 1] > array[right])
                      swap(right - 1, right);

                 return;
            }
      }

      private void swap(int index1, int index2)
      {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
      }
}
