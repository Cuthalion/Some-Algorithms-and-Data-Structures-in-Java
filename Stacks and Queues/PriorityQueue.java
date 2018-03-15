public class PriorityQueue
{
      private int maxSize;
      private int[] array;
      private int numberOfElements;

      public PriorityQueue(int maxSize)
      {
            this.maxSize = maxSize;
            array = new int[maxSize];
            numberOfElements = 0;
      }

      public void insert(int value)
      {
            if(numberOfElements == 0)
                array[numberOfElements++] = value;

            else if(numberOfElements != maxSize)
            {
                  int i;
                  for(i = numberOfElements - 1; i >=0; i--)
                  {
                        if(value > array[i])
                            array[i + 1] = array[i];
                        else
                            break;
                  }

                  array[i + 1] = value;
                  numberOfElements++;
            }
            else
            {
                  System.out.println("Can't insert priority queue is full.");
            }
      }

      public int remove()
      {
            if(numberOfElements != 0)
            {
                  return array[--numberOfElements];
            }
            else{
                  System.out.println("Can't remove priority queue is empty.");
                  return 0;
            }
      }

      public int peekMin()
      {
            return array[numberOfElements - 1];
      }

      public boolean isFull()
      {
            return numberOfElements == maxSize;
      }

      public boolean isEmpty()
      {
           return numberOfElements == 0;
      }

      public void display()
      {
           for(int i = numberOfElements - 1; i >= 0; i--)
           {
                System.out.printf("%d ", array[i]);
           }

           System.out.println();
      }

}
