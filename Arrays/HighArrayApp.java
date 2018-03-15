public class HighArrayApp{

     public static void main(String[] args){

		     int maxSize = 100;
				 HighArray arr = new HighArray(maxSize);
         HighArray inverseArr = new HighArray(maxSize);

				 arr.insert(41);
         arr.insert(5);
         arr.insert(13);
         arr.insert(28);
         arr.insert(7);
         arr.insert(23);

				 arr.display();

         for(int i = 0; i < 6; i++)
             inverseArr.insert(arr.removeMax());
          inverseArr.display();



        /* System.out.println("Highest key is: " + arr.max());

				 int searchKey = 8;
				 if(arr.find(searchKey))
				     System.out.printf("%d is found in array.%n", searchKey);
				 else
				     System.out.printf("%d is not found in array.%n", searchKey);

				 arr.delete(0);
				 arr.delete(41);
				 arr.delete(79);

				 arr.display();*/

		 }
}
