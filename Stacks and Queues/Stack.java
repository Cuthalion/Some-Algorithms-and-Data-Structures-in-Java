public class Stack
{

      int[] stackArray;
      int maxSize;
      int top;

      public Stack(int maxSize)
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

      public boolean isFull()
      {
           return top == (maxSize - 1);
      }

      public boolean isEmpty()
      {
           return top == -1;
      }
}
