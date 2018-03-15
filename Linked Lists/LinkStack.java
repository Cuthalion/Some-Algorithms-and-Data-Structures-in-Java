public class LinkStack
{
      StackLinkList list;

      public LinkStack()
      {
           list = new StackLinkList();
      }

      public void push(int iData)
      {
           list.insertFirst(iData);
      }

      public int pop()
      {
           return list.deleteFirst();
      }

      public boolean isEmpty()
      {
           return list.isEmpty();
      }

      public void displayStack()
      {
           System.out.println("Stack (top-->bottom): ");
           list.displayList();
      }
}
