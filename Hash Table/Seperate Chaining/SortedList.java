public class SortedList
{
       private Link first;

       public void SortedList()
       {
             first = null;
       }

       public boolean isEmpty()
       {
             return first == null;
       }

       public void insert(int key)
       {
             Link newLink = new Link(key);

             Link current = first;
             Link previous = null;

             while(current != null &&
                  key > current.getKey())
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

       public void delete(int key)
       {
             if(!isEmpty())
             {
                    Link previous = null;
                    Link current = first;

                    while(current != null &&
                         key != current.getKey())
                    {
                         previous = current;
                         current = current.next;
                    }

                    if(previous == null)
                         first = first.next;
                    else
                         previous.next = current.next;
             }

       }

       public Link find(int key)
       {
             Link current = first;

             while(current != null &&
                  key <= current.getKey())
             {
                  if(key == current.getKey())
                       return current;
                  current = current.next;
             }

             return null;
       }

       public void displayList()
       {
             Link current = first;

             System.out.print("first-->last: ");

             while(current != null)
             {
                   current.displayLink();
                   current = current.next;
             }

             System.out.println("");
       }
}
