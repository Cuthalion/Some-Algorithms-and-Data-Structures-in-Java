public class FirstLastApp
{
      public static void main(String[] args)
      {

            FirstLastLink list = new FirstLastLink();

            list.insertFirst(15);
            list.insertFirst(8);
            list.insertFirst(74);

            list.insertLast(47);
            list.insertLast(8);
            list.insertLast(51);

            list.displayList();
      }
}
