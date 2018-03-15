public class LinkList
{
      Link first;

      public LinkList()
      {
           first = null;
      }

      public boolean isEmpty()
      {
           return first == null;
      }

      public void insertFirst(int iData, double dData)
      {
           Link newLink = new Link(iData, dData);
           newLink.next = first;
           first = newLink;
      }

      public Link deleteFirst()
      {
             if(!isEmpty())
             {
                  Link temp = first;
                  first = first.next;
                  return temp;
             }
             else
             {
                  System.out.println("Linked list is empty.");
                  return null;
             }
      }

      public Link find(int iData, double dData)
      {
             Link current = first;

             while(current.iData != iData &&
                  current.dData != dData)
              {
                   if(current == null)
                       return null;
                   else
                       current = current.next;
              }

              return current;
      }

      public Link delete(int iData, double dData)
      {
              Link current = first;
              Link previous = first;

              while(current.iData != iData &&
                  current.dData != dData)
              {
                  if(current == null)
                      return null;
                  else{
                      previous = current;
                      current = current.next;
                  }
              }

              if(current == first)
                   first = first.next;
              else
                   previous.next = current.next;
              return current;
      }

      public void displayList()
      {
            System.out.print("List (first-->last): ");
            Link current = first;

            while(current != null)
            {
                 current.displayLink();
                 current = current.next;
            }
            System.out.println("");
      }
}
