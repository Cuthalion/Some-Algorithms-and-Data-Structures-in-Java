import java.security.SecureRandom;

public class SortExperiment{

      public static void main(String[] args){

           SecureRandom random = new SecureRandom();
           int maxSize = 10000;
           long startTime;
           long endTime;

           ArrayIns arr = new ArrayIns(maxSize);
           ArrayBub arr2 = new ArrayBub(maxSize);
           ArraySel arr3 = new ArraySel(maxSize);

           for(int i = 10000; i > 1; i--){
                arr.insert(i);
                arr2.insert(i);
                arr3.insert(i);
            }


            startTime = System.currentTimeMillis();
            arr.insertionSort();
            endTime = System.currentTimeMillis();
            System.out.printf("Insertion sort: %d%n", (endTime - startTime));

            startTime = System.currentTimeMillis();
            arr2.bubbleSort();
            endTime = System.currentTimeMillis();
            System.out.printf("Bubble sort: %d%n", (endTime - startTime));

            startTime = System.currentTimeMillis();
            arr3.selectionSort();
            endTime = System.currentTimeMillis();
            System.out.printf("Selection sort: %d%n", (endTime - startTime));

      }
}
