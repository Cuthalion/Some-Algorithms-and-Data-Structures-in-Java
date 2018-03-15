public class ObjectArray{

       Person[] n;
       int numberOfElements;

       public ObjectArray(int maxSize){

             n = new Person[maxSize];
             numberOfElements = 0;
       }

       public void insert(String firstName, String lastName, int age){

             n[numberOfElements] = new Person(firstName, lastName, age);
             numberOfElements++;
       }

       public void display(){

             for(int i = 0; i < numberOfElements; i++)
                  n[i].displayPerson();
             System.out.println();
       }

       public void insertionSort(){

             int in, out;

             for(out = 1; out < numberOfElements; out++){

                  in = out;
                  Person temp = n[out];

                  while(in > 0 &&
                        n[in - 1].getLast().compareTo(temp.getLast()) > 0){

                               n[in] = n[in - 1];
                               in --;
                        }
                 n[in] = temp;
             }
       }
}
