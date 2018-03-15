public class LinkQueue
{
     QueueFirstLastLink list;

     public LinkQueue()
     {
          list = new QueueFirstLastLink();
     }

     public boolean isEmpty()
     {
          return list.isEmpty();
     }

     public void insert(int iData)
     {
          list.insertLast(iData);
     }

     public int delete()
     {
          return list.deleteFirst();
     }

     public void displayQueue()
     {
          System.out.print("Queue (front-->rear): ");
          list.displayList();
     }
}
