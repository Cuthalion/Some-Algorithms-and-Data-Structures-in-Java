public class IntStack
{

      int[] stackArray;
      int maxSize;
      int top;

      public IntStack(int maxSize)
      {
           this.maxSize = maxSize;
           stackArray = new int[maxSize];
           top = -1;
      }

      public void push(int value)
      {
           if(top != maxSize - 1)
              stackArray[++top] = value;
           else
              System.out.printf("Can't insert, stack is full!%n");
      }

      public int pop()
      {
           return stackArray[top--];
      }

      public int peek(){
           return stackArray[top];
      }

      public int peekN(int n)
      {
           return stackArray[n];
      }

      public boolean isFull()
      {
           return top == (maxSize - 1);
      }

      public boolean isEmpty()
      {
           return top == -1;
      }

      public int size()
      {
           return top + 1;
      }

      public void displayStack(String header)
      {
           System.out.print(header);
           System.out.println(" stack (bottom --> top):");

           for(int i = 0; i < size(); i++)
           {
                System.out.printf("%d ", peekN(i));
           }
      }
}
