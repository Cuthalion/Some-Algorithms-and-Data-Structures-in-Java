public class PriorityQueueApp
{

       public static void main(String[] args)
       {
             PriorityQueue pQueue = new PriorityQueue(10);

             pQueue.insert(15);
             pQueue.insert(8);
             pQueue.insert(4);
             pQueue.insert(18);
             pQueue.insert(34);

             pQueue.display();

       }
}
