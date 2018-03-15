public class ListIterator
{
      private Link current;
      private Link prev;
      private LinkList ourList;

      public ListIterator(LinkList ourList)
      {
            this.ourList = ourList;
            reset();
      }

      public void reset()
      {
            current = ourList.getFirst();
            prev = null;
      }

      public boolean atEnd()
      {
            return current.getNext() == null;
      }

      public void nextLink()
      {
            prev = current;
            current = current.getNext();
      }

      public Link getCurrent()
      {
            return current;
      }

      public void insertAfter(int iData)
      {
            Link newLink = new Link(iData);

            if(ourList.isEmpty())
            {
                 ourList.setFirst(newLink);
                 current = newLink;
            }
            else
            {
                 newLink.setNext(current.getNext());
                 current.setNext(newLink);
                 nextLink();
            }
      }

      public void insertBefore(int iData)
      {
            Link newLink = new Link(iData);

            if(prev == null)
            {
                 newLink.setNext(ourList.getFirst());
                 ourList.setFirst(newLink);
                 reset();
            }
            else
            {
                 newLink.setNext(current);
                 prev.setNext(newLink);
                 current = newLink;
            }
      }

      public int deleteCurrent()
      {
            int value = current.getData();

            if(prev == null)
            {
                 ourList.setFirst(current.getNext());
                 reset();
            }
            else
            {
                prev.setNext(current.getNext());
                if(atEnd())
                    reset();
                else
                    current = current.getNext();
            }

            return value;
      }
}
