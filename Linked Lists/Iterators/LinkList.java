public class LinkList
{
      private Link first;

      public LinkList()
      {
           first = null;
      }

      public void setFirst(Link first)
      {
           this.first = first;
      }

      public Link getFirst()
      {
           return first;
      }

      public boolean isEmpty()
      {
           return first == null;
      }

      public ListIterator getIterator()
      {
           return new ListIterator(this);
      }

      public void displayList()
      {
           Link current = first;
           while(current != null)
           {
                current.displayLink();
                current = current.getNext();
           }
           System.out.println();
      }
}
