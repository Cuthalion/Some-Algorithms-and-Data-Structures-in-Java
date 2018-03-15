public class QueueApp
{

      public static void main(String[] args)
      {
            Queue myQueue = new Queue(5);

            myQueue.insert(10);
            myQueue.insert(15);
            myQueue.insert(47);
            myQueue.insert(8);
            myQueue.remove();
            myQueue.remove();
            myQueue.insert(31);
            myQueue.insert(88);

            while(!myQueue.isEmpty())
            {
                System.out.printf("%d ", myQueue.remove());
            }
      }
}
