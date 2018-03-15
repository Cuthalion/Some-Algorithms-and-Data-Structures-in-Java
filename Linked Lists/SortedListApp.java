public class SortedListApp{

      public static void main(String[] args)
      {
            SortedList list = new SortedList();

            list.insert(7);
            list.insert(4);
            list.insert(35);

            list.displayList();

            list.insert(18);
            list.insert(12);

            list.displayList();
      }
}
