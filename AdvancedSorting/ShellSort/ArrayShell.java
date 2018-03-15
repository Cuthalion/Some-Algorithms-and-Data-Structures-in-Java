public class ArrayShell
{
       private int[] array;
       private int numberOfElements;

       public ArrayShell(int maxSize)
       {
             array = new int[maxSize];
             numberOfElements = 0;
       }

       public void insert(int value)
       {
             array[numberOfElements++] = value;
       }

       public void display()
       {
             for(int i = 0; i < numberOfElements; i++)
                   System.out.printf("%d ", array[i]);
              System.out.println("\n");
       }

       public void shellSort()
       {
             int inner, outer, temp;
             int h = 1;
             while(h <= numberOfElements / 3)
                  h = h * 3 + 1;

             while(h > 0)
             {
                  for(outer = h; outer < numberOfElements; outer++)
                  {
                        temp = array[outer];
                        inner = outer;

                        while(inner > h - 1 && array[inner - h] >= temp)
                        {
                              array[inner] = array[inner - h];
                              inner = inner - h;
                        }
                        array[inner] = temp;
                  }

                  h = (h - 1) / 3;
             }
       }
}
