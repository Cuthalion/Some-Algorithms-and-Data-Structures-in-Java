//Demonstrates array class with high-level interface
public class HighArray{

    private int[] elements;
		private int numberOfElements;

		public HighArray(int size){
		    elements = new int[size];
				numberOfElements = 0;
		}

    public boolean find(int elem){

				int j;

				for(j = 0; j < numberOfElements; j++)
				    if(elements[j] == elem)
						    break;
						if(j == numberOfElements)
						    return false;
						else
						    return true;
		}

		public void insert(int elem){

				elements[numberOfElements] = elem;
				numberOfElements++;
		}

		public void delete(int elem){

				int j;

				for(j = 0; j < numberOfElements; j++)
				    if(elements[j] == elem)
						    break;
				if(j == numberOfElements)
				    System.out.printf("%d is not found.%n", elem);
				else{
						System.out.printf("%d is deleted.%n", elements[j]);
						for(int i = j; i < numberOfElements; i++)
						    elements[i] = elements[i + 1];
            numberOfElements--;
				}

        display();
		}

		public void display(){

		    for(int i = 0; i < numberOfElements; i++)
				    System.out.printf("%d  ", elements[i]);
				System.out.println();
		}

    public int removeMax(){

          if(numberOfElements == 0)
              return -1;
          else{
              int i;
              int max = elements[0];
              for(i = 1; i < numberOfElements; i++)
                  if(elements[i] > max)
                      max = elements[i];
              delete(max);
              return max;
          }
    }


}
