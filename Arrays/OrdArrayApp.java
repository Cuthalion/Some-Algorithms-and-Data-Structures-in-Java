public class OrdArrayApp{

    public static void main(String[] args){

		    int maxSize = 100;
				OrdArray arr = new OrdArray(100);

				arr.insert(5);
				arr.insert(74);
				arr.insert(14);
				arr.insert(22);
				arr.insert(5);
				arr.insert(85);
        arr.delete(22);

				arr.display();

				/*int searchKey = 14;
				if(arr.find(searchKey) != arr.size())
				    System.out.printf("%d is found at %d. indice.%n%n",
						    searchKey, arr.find(searchKey));
				else
				    System.out.printf("%d is not found in array%n%n.", searchKey);

				arr.delete(22);
				arr.delete(1);
				arr.delete(74);

				arr.display();*/
		}
}
