public class Link
{
      private int iData;
      private Link next;
      private Link previous;

      public Link(int iData)
      {
            this.iData = iData;
            this.next = null;
            this.previous = null;
      }

      public int getData()
      {
            return iData;
      }
      public void setNext(Link next)
      {
            this.next = next;
      }

      public Link getNext()
      {
            return next;
      }

      public void setPrevious(Link previous)
      {
            this.previous = previous;
      }

      public Link getPrevious()
      {
            return previous;
      }

      public void displayLink()
      {
            System.out.printf("%d ", iData);
      }
}
