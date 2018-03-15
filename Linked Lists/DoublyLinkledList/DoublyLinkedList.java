public class DoublyLinkedList
{
      private Link first;
      private Link last;

      public DoublyLinkedList()
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
           Link newLink = new Link(iData);

           if(isEmpty())
              last = newLink;
           else
              first.setPrevious(newLink);

           newLink.setNext(first);
           first = newLink;
      }

      public void insertLast(int iData)
      {
           Link newLink = new Link(iData);

           if(isEmpty())
               first = newLink;
           else
               last.setNext(newLink);
           newLink.setPrevious(last);
           last = newLink;
      }

      public Link deleteFirst()
      {
           Link temp = first;

           if(first.getNext() == null)
               last = null;
           else
               first.getNext().setPrevious(null);

            first = first.getNext();
            return temp;
      }

      public Link deleteLast()
      {
           Link temp = last;

           if(last.getPrevious() == null)
               first = null;
           else
               last.getPrevious().setNext(null);

           last = last.getPrevious();
           return temp;
      }

      public boolean insertAfter(int iData, int key)
      {
           Link current = first;
           while(current.getData() != key)
           {
                current = current.getNext();
                if(current == null)
                   return false;
           }

           Link newLink = new Link(iData);

           if(current == last)
           {
                newLink.setNext(null);
                last = newLink;
           }
           else
           {
                newLink.setNext(current.getNext());
                current.getNext().setPrevious(newLink);
           }

           newLink.setPrevious(current);
           current.setNext(newLink);
           return true;
      }

      public Link deleteKey(int key)
      {
           Link current = first;
           while(current.getData() != key)
           {
                current = current.getNext();
                if(current == null)
                    return null;
           }

           if(current == last)
              last = last.getPrevious();
           else
              current.getNext().setPrevious(current.getPrevious());

           if(current == first)
              first = first.getNext();
           else
              current.getPrevious().setNext(current.getNext());
           return current;
      }

      public void displayForward()
      {
           System.out.println("List (first-->last)");
           Link current = first;
           while(current != null)
           {
                current.displayLink();
                current = current.getNext();
           }
           System.out.println();
      }

      public void displayBackward()
      {
           System.out.println("List (last-->first)");
           Link current = last;
           while(current != null)
           {
                current.displayLink();
                current = current.getPrevious();
           }
           System.out.println();
      }
}
