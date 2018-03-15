public class QueueApp
{
       public static void main(String[] args)
       {
             Queue q1 = new Queue(5);

             q1.insert(6);
             q1.insert(3);
             q1.insert(10);
             q1.remove();
             q1.remove();
             q1.insert(4);
             q1.insert(8);
             q1.insert(14);
             q1.display();
       }
}
