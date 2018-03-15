public class LinkListApp
{
      public static void main(String[] args)
      {
            LinkList list = new LinkList();

            list.insertFirst(5, 3.2);
            list.insertFirst(17, 1.4);
            list.insertFirst(14, 7.8);
            list.insertFirst(34, 3.9);

            list.displayList();

            list.delete(14, 7.8);
            list.displayList();
      }
}
