public class Queue{

      int[] array;
      int maxSize;
      int front;
      int rear;
      int numberOfElements;

      public Queue(int maxSize)
      {
          this.maxSize = maxSize;
          this.array = new int[maxSize];
          this.front = 0;
          this.rear = -1;
          this.numberOfElements = 0;
      }

      public void insert(int value)
      {
          if(rear == maxSize - 1)
              rear = -1;

          if(!isFull())
          {
              array[++rear] = value;
              numberOfElements++;
          }
          else
          {
              System.out.println("Can't insert queue is full.");
          }
      }

      public int remove()
      {
          if(front == maxSize)
              front = 0;

          if(!isEmpty())
          {
              numberOfElements--;
              return array[front++];
          }
          else
          {
              System.out.println("Can't remove queue is empty.");
              return 0;
          }
      }

      public int peek()
      {
           return array[front];
      }

      public boolean isEmpty()
      {
           return numberOfElements == 0;
      }

      public boolean isFull()
      {
           return numberOfElements == maxSize;
      }

      public int size()
      {
           return numberOfElements;
      }

      public void display()
      {

           if(rear != -1){
                 while(front != (rear + 1))
                 {
                       if(front == maxSize)
                          front = 0;

                       System.out.printf("%d ", peek());
                       front++;
                 }
          }
          else
          {
                  System.out.println("The queue is empty.");
          }
      }
}
