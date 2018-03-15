public class SortedList
{
      private Link first;

      public SortedList()
      {
           first = null;
      }

      public SortedList(Link[] linkArr)
      {
           first = null;
           for(int i = 0; i < linkArr.length; i++)
                insert(linkArr[i]);
      }

      public boolean isEmpty()
      {
           return first == null;
      }

      public void insert(Link link)
      {
           Link previous = null;
           Link current = first;

           while(current != null &&
              link.getData() > current.getData())
           {
                previous = current;
                current = current.getNext();
           }

           if(previous == null)
                first = link;
           else
                previous.setNext(link);
           link.setNext(current);
      }

      public Link remove()
      {
           Link temp = first;
           first = first.getNext();
           return temp;
      }


}
