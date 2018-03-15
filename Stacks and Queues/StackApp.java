public class StackApp{

      public static void main(String[] args)
      {

            Stack s1 = new Stack(5);

            s1.push(10);
            s1.push(17);
            s1.push(18);
            s1.push(57);

            System.out.print("Items in the stack: ");

            while(!s1.isEmpty()){
                 System.out.printf("%d ", s1.pop());
            }
      }
}
