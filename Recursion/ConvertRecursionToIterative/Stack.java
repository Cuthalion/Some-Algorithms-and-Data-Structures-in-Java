public class Stack
{
       private int maxSize;
       private Params[] arr;
       private int top;

       public stackX(int maxSize)
       {
             this.maxSize = maxSize;
             arr = new Params[maxSize];
             top = -1;
       }

       public void push(Params obj)
       {
             arr[++top] = obj;
       }

       public Params pop()
       {
             return arr[top--];
       }

       public Params peek()
       {
             return arr[top];
       }
} 
