public class Array
{
      int[] arr;
      int numberOfElements;

      public Array(int maxSize)
      {
            arr = new int[maxSize];
            numberOfElements = 0;
      }

      public void insert(int value)
      {
            arr[numberOfElements++] = value;
      }

      public void display()
      {
           for(int elem : arr)
               System.out.printf("%d ", elem);
           System.out.println();
      }

      public void mergeSort()
      {
           int[] workSpace = new int[numberOfElements];
           recMergeSort(workSpace, 0, numberOfElements - 1);
      }

      private void recMergeSort(int[] workSpace, int lowerBound
           int upperBound)
      {

           if(upperBound == lowerBound)
               return;
           else
           {
               int mid = (upperBound + lowerBound) / 2;

               recMergeSort(workSpace, lowerBound, mid);
               recMergeSort(workSpace, mid + 1, upperBound);

               merge(workSpace, lowerBound, mid + 1, upperBound);
           }
      }

      private void merge(int[] workSpace, int lowPtr,
          int highPtr, int upperBound)
      {
          int j = 0;
          int mid = highPtr - 1;
          int lowerBound = lowPtr;

          while(lowPtr <= mid && highPtr <= upperBound)
              if(arr[lowPtr] < arr[highPtr])
                workSpace[j++] = arr[lowPtr++];
              else
                workSpace[j++] = arr[highPtr++];

          while(lowPtr <= mid)
              workSpace[j++] = arr[lowPtr++];
          while(highPtr <= upperBound)
              workSpace[j++] = arr[highPtr++];

          for(int i = 0; i < (highPtr - lowPtr + 1); i++)
              arr[lowerBound + i] = workSpace[i];

      }
}
