//Demonstrates bubble sort

public class ArrayBub{

        int[] n;
        int numberOfElements;

        public ArrayBub(int max){

             n = new int[max];
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

        public void bubbleSort(){

               int in, out;

               for(out = numberOfElements - 1; out > 1; out--)
                   for(in = 0; in < out; in++)
                        if(n[in] > n[in + 1])
                            swap(in, in + 1);
        }

        public void swap(int one, int two){

               int temp = n[one];
               n[one] = n[two];
               n[two] = temp;
        }
}
