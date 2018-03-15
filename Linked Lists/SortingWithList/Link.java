public class Link
{
      private int iData;
      private Link next;

      public Link(int iData)
      {
            this.iData = iData;
      }

      public void setNext(Link next)
      {
            this.next = next;
      }

      public Link getNext()
      {
            return this.next;
      }

      public int getData()
      {
            return iData;
      }

      public void displayLink()
      {
            System.out.printf("%d ", iData);
      }
}
