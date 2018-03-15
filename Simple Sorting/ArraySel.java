//Demonsrates selection sort.
public class ArraySel{

     int[] n;
     int numberOfElements;

     public ArraySel(int maxSize){

          n = new int[maxSize];
          numberOfElements = 0;
     }

     public void insert(int value){

          n[numberOfElements] = value;
          numberOfElements++;
     }

     public void display(){

          for(int i = 0; i < numberOfElements; i++)
               System.out.printf("%d ", n[i]);
          System.out.println();
     }

     public void selectionSort(){

           int in, out, min;

           for(out = 0; out < numberOfElements - 1; out++){
                min = out;
                for(in = out + 1; in < numberOfElements; in++)
                      if(n[in] < n[min])
                          min = in;
                swap(out, min);

           }
     }

     public void swap(int one, int two){

           int temp = n[one];
           n[one] = n[two];
           n[two] = temp;
     }
}
