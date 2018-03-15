public class QueueFirstLastLink
{
      IntLink first;
      IntLink last;

      public QueueFirstLastLink()
      {
           first = null;
           last = null;
      }

      public boolean isEmpty()
      {
           return first == null;
      }

      public void insertLast(int iData)
      {
           IntLink newLink = new IntLink(iData);

           if(isEmpty())
               first = newLink;
           else
               last.next = newLink;
           last = newLink;
      }

      public int deleteFirst()
      {
           IntLink temp = first;

           if(first.next == null)
               last = null;
           first = first.next;
           return temp.iData;
      }

      public void displayList()
      {
           IntLink current = first;

           while(current != null)
           {
                current.displayLink();
                current = current.next;
           }
           System.out.println();
      }
}
