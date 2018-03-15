public class ArrayIns{

     int[] n;
     int numberOfElements;

     public ArrayIns(int maxSize){

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

     public void insertionSort(){

          int out, in;

          for(out = 1; out < numberOfElements; out++){
                int temp = n[out];
                in = out;
                while(in > 0 && n[in - 1] >= temp){
                     n[in] = n[in - 1];
                     in--;
                }
                n[in] = temp;
          }
     }
}
