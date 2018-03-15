public class OrdArrayApp
{
      public static void main(String[] args)
      {
           OrdArray object = new OrdArray(10);

           object.insert(5);
           object.insert(2);
           object.insert(54);
           object.insert(41);
           object.insert(49);

           object.displayArray();

           if(object.find(54) != object.getSize())
               System.out.printf("%nItem is found at %d", object.find(54));
           else
              System.out.printf("Item is not found");
      }
}
