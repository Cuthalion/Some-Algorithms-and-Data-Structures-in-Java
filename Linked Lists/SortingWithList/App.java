public class App
{

      public static void main(String[] args)
      {
            Link[] array = new Link[10];

            for(int i = 0; i < array.length; i++)
            {
                  int iData = (int)(java.lang.Math.random() * 99);
                  Link newLink = new Link(iData);
                  array[i] = newLink;
            }

            System.out.println("Unsorted array:");
            for(Link elem : array)
                elem.displayLink();

            SortedList sort = new SortedList(array);
            for(int i = 0; i < array.length; i++)
                array[i] = sort.remove();

            System.out.println("\nArray after sorted with linked list: ");
            for(Link elem : array)
                elem.displayLink();
      }
}
