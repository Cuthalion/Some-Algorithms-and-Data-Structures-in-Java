public class LinkQueueApp
{
      public static void main(String[] args)
      {
            LinkQueue queue = new LinkQueue();

            queue.insert(5);
            queue.insert(14);
            queue.insert(61);
            queue.insert(55);
            queue.displayQueue();

            queue.delete();
            queue.displayQueue();
      }
}
