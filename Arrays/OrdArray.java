public class OrdArray{

    private int[] n;
		private int numberOfElements;

		public OrdArray(int max){

				n = new int[max];
				numberOfElements = 0;
		}

		public int size(){
		    return numberOfElements;
		}

		public int find(int searchKey){

		    int lowerBound = 0;
				int upperBound = numberOfElements - 1;

				while(true){

				    int current = (lowerBound + upperBound) / 2;
						if(n[current] == searchKey)
						    return current;
						else if(lowerBound > upperBound)
						    return numberOfElements;
						else
						    if(searchKey > n[current])
								    lowerBound = current + 1;
								else
								    upperBound = current - 1;
				}
		}

		public void insert(int value){

      int lowerBound = 0;
      int upperBound = numberOfElements - 1;
      int current;

      while(!(lowerBound > upperBound)){

            current = (lowerBound + upperBound) / 2;

            if(value > n[current])
                lowerBound = current + 1;
            else
                upperBound = current - 1;
      }

      if(numberOfElements == 0)
      {
            n[numberOfElements] = value;
            numberOfElements++;
      }
      else
      {
            for(int i = numberOfElements; i > lowerBound; i--)
            {
                try
                {
                    n[i] = n[i - 1];
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                      System.out.println(e);
                      System.out.printf("Error in index: %d%n", i);
                }
            }
            n[lowerBound] = value;
            numberOfElements++;
      }
    }

		public void delete(int value){

		    int index = find(value);

				if(index != numberOfElements){
				    for(int i = index; i < numberOfElements; i++)
						    n[i] = n[i + 1];
						System.out.printf("%d deleted succesfully.%n", value);
						numberOfElements--;
				}
				else
				    System.out.printf("%d is not found in array.%n", value);
		}

		public void display(){

		     for(int i = 0; i < numberOfElements; i++)
				     System.out.printf("%d  ", n[i]);
					System.out.println();
		}
}
