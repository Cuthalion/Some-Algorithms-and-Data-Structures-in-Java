public class App2
{
      public static void main(String[] args)
      {
            LinkList list = new LinkList();
            ListIterator iter1 = list.getIterator();

            iter1.insertAfter(5);
            iter1.insertAfter(10);
            iter1.insertAfter(15);
            iter1.insertAfter(20);
            iter1.insertAfter(24);

            iter1.reset();

            Link aLink = iter1.getCurrent();
            if(aLink.getData() % 3 == 0)
               System.out.printf("%d ", aLink.getData());

            while(!iter1.atEnd())
            {
                 iter1.nextLink();
                 if(iter1.getCurrent().getData() % 3 == 0)
                     System.out.printf("%d ", iter1.getCurrent().getData());
            }


      }
}
