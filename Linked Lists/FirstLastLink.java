public class FirstLastLink
{
       IntLink first;
       IntLink last;

       public FirstLastLink()
       {
             first = null;
             last = null;
       }

       public boolean isEmpty()
       {
             return first == null;
       }

       public void insertFirst(int iData)
       {
             IntLink newLink = new IntLink(iData);

             if(isEmpty())
                  last = newLink;
             newLink.next = first;
             first = newLink;
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

       public IntLink deleteFirst()
       {
             IntLink temp = first;

             if(first.next == null)
                  last = null;
             first = first.next;
             return first;
       }

       public void displayList()
       {
             System.out.println("List (first-->last): ");
             IntLink current = first;

             while(current != null)
             {
                  current.displayLink();
                  current = current.next;
             }

             System.out.println();
       }


}
