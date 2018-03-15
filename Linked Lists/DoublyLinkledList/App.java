public class App
{
      public static void main(String[] args)
      {
            DoublyLinkedList list = new DoublyLinkedList();

            list.insertLast(5);
            list.insertLast(10);
            list.insertLast(7);
            list.insertFirst(8);
            list.displayForward();

            list.insertAfter(12, 7);
            list.insertAfter(17, 5);
            list.displayForward();


            list.deleteKey(7);
            list.displayForward();

            list.deleteFirst();
            list.deleteLast();
            list.displayBackward();
      }
}
