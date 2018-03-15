public class SortedList
{
      IntLink first;

      public SortedList()
      {
            first = null;
      }

      public boolean isEmpty()
      {
            return first == null;
      }

      public void insert(int iData)
      {
            IntLink newLink = new IntLink(iData);

            IntLink previous = null;
            IntLink current = first;

            while(current != null && iData > current.iData)
            {
                 previous = current;
                 current = current.next;
            }

            if(previous == null)
                 first = newLink;
            else
                 previous.next = newLink;
            newLink.next = current;
      }

      public IntLink remove()
      {
            IntLink temp = first;
            first = first.next;
            return temp;
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
