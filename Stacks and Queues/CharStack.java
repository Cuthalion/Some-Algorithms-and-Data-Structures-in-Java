public class CharStack
{

      char[] stackArray;
      int maxSize;
      int top;

      public CharStack(int maxSize)
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

      public boolean isFull()
      {
           return top == (maxSize - 1);
      }

      public boolean isEmpty()
      {
           return top == -1;
      }
}
