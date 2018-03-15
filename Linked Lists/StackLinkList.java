public class StackLinkList
{
       IntLink first;

       public StackLinkList()
       {
            first = null;
       }

       public boolean isEmpty()
       {
            return first == null;
       }

       public void insertFirst(int iData)
       {
            IntLink newLink = new IntLink(iData);
            newLink.next = first;
            first = newLink;
       }

       public int deleteFirst()
       {
            IntLink temp = first;
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
            System.out.println("\n\n");
       }
}
