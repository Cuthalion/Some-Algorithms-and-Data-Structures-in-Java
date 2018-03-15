public class DataArray{

        private Person[] n;
        private int numberOfElements;

        public DataArray(int max){

            n = new Person[max];
            numberOfElements = 0;
        }

        public Person find(String searchKey){

            int i;
            for(i = 0; i < numberOfElements; i++)
                if(n[i].getLastName().equals(searchKey))
                    break;

            if(i == numberOfElements)
                return null;
            else
                return n[i];
        }

        public void insert(String firstName, String lastName, int age){

            n[numberOfElements] = new Person(firstName, lastName, age);
            numberOfElements++;
        }

        public boolean delete(String searchKey){

            int i;
            for(i = 0; i < numberOfElements; i++)
                if(n[i].getLastName().equals(searchKey))
                    break;

            if(i == numberOfElements)
                return false;
            else{
                for(int j = i; j < numberOfElements; j++)
                    n[j] = n[j + 1];
                numberOfElements--;
                return true;
            }
        }

        public void display(){

            for(int i = 0; i < numberOfElements; i++)
                n[i].display();
        }
}
