public class QuickSort
{
      int[] array;
      int numberOfElements;

      public QuickSort(int maxSize)
      {
           array = new int[maxSize];
           numberOfElements = 0;
      }

      public void insert(int value)
      {
           array[numberOfElements++] = value;
      }

      public void display()
      {
           for(int elem : array)
               System.out.printf("%d ", elem);
           System.out.println();
      }

      public void quickSort()
      {
           recQuickSort(0, numberOfElements - 1);
      }

      private void recQuickSort(int left, int right)
      {
           if(right - left <= 0)
                return;
           else
           {
                int pivot = array[right];
                int partition = partitionIt(left, right, pivot);

                recQuickSort(left, partition - 1);
                recQuickSort(partition + 1, right);
           }
      }

      private int partitionIt(int left, int right, int pivot)
      {
           int leftPtr = left - 1;
           int rightPtr = right;

           while(true)
           {
                while(array[++leftPtr] < pivot);

                while(rightPtr > 0 && array[--rightPtr] > pivot);

                if(leftPtr >= rightPtr)
                    break;
                swap(leftPtr, rightPtr);
           }
           swap(leftPtr, right);
           return leftPtr;
      }

      private void swap(int index1, int index2)
      {
           int temp = array[index1];
           array[index1] = array[index2];
           array[index2] = temp;
      }
}
