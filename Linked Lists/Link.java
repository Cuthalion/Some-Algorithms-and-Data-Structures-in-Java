public class Link
{
      int iData;
      double dData;
      Link next;

      public Link(int iData, double dData)
      {
            this.iData = iData;
            this.dData = dData;
      }

      public void displayLink()
      {
            System.out.printf("{%d, %.2f}", iData, dData);
      }
}
