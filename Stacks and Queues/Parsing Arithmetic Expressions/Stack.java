public class Stack
{

      char[] stackArray;
      int maxSize;
      int top;

      public Stack(int maxSize)
      {
           this.maxSize = maxSize;
           stackArray = new char[maxSize];
           top = -1;
      }

      public void push(char value)
      {
           if(top != maxSize - 1)
              stackArray[++top] = value;
           else
              System.out.printf("Can't insert, stack is full!%n");
      }

      public char pop()
      {
           return stackArray[top--];
      }

      public char peek(){
           return stackArray[top];
      }

      public char peekN(int n)
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
