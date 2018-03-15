//Demonstrates bubble sort

public class NewBubbleSort{

        int[] n;
        int numberOfElements;

        public NewBubbleSort(int max){

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

               int in, outL, outR;
               boolean iterationDone;

               for(outR = numberOfElements - 1, outL = 1;
                   outR > 1 && outL < numberOfElements - 1; outR--, outL++){

                   in = 0;
                   iterationDone = false;
                   while(!iterationDone){
+
                            if(n[in] > n[in + 1])
                                swap(in, in + 1);
                            in++;
                            //System.out.printf("in is icremented to: %d", in);
                            System.out.print(in);
                      }

                       else{
                             if(n[in] < n[in - 1])
                                swap(in - 1, in);
                             in--;
                            // System.out.printf("in is decremented from: %d", in);
                      }
                       if(in == outL)
                            iterationDone = true;

                    }
            }
        }

        public void swap(int one, int two){

               int temp = n[one];
               n[one] = n[two];
               n[two] = temp;
        }
}
