class LowArrayApp{

        public static void main(String[] args){

				    LowArray arr =
						    new LowArray(100);
						int i;
						int numberOfElements;

						arr.setElement(0,77);
						arr.setElement(1,99);
						arr.setElement(2,44);
						arr.setElement(3,55);
						arr.setElement(4,22);
						arr.setElement(5,88);
						arr.setElement(6,11);
						arr.setElement(7,00);
						arr.setElement(8,66);
						arr.setElement(9,33);
						numberOfElements = 10;

						for(i = 0; i < numberOfElements; i++)
						    System.out.printf("%d  ", arr.getElement(i));
						System.out.println();

						int searchKey = 26;
						for(i = 0; i < numberOfElements; i++)
						    if(arr.getElement(i) == 26)
								    break;
						if(i == numberOfElements)
						    System.out.printf("%d can't found.%n", searchKey);
						else
						    System.out.printf("%d found at index: %d%n", searchKey, i);

						for(i = 0; i < numberOfElements; i++)
						    if(arr.getElement(i) == 55)
								   	break;

						for(int j = i; j < (numberOfElements - 1); j++)
						    arr.setElement(j, arr.getElement(j + 1));

						for(i = 0; i < numberOfElements - 1; i++)
						    System.out.printf("%d  ", arr.getElement(i));
						System.out.println();
				}
}
