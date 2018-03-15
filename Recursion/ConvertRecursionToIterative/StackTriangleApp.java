public class StackTriangleApp
{
       static int theNumber;
       static int theAnswer = 0;
       static Stack stack;
       static int codePart;
       static Params params;

       public static void main(String[] args)
       {
             theNumber = 5;
             recTriangle();
             System.out.println("Triangle: " + theAnswer);
       }

       public void recTriangle()
       {
             stack = new Stack(100);
             codePart = 1;
             while(step() == false);
       }

       public boolean step()
       {
             switch(codePart)
             {
                   case 1:
                       params = new Params(theNumber, 6);
                       stack.push(params);
                       codePart = 2;
                       break;
                   case 2:
                        params = stack.peek();
                        if(params.n == 1)
                        {
                           theAnswer = 1;
                           codePart = 5;
                        }
                        else
                            codePart = 3;
                        break;
                    case 3:
                        params = new Params(params.n - 1, 4);
                        stack.push(params);
                        codePart = 2;
                        break;
                    case 4:
                        params = stack.peek();
                        theAnswer += params.n;
                        codePart = 5;
                        break;
                    case 5:
                        params = stack.peek();
                        codePart = params.returnAdress;
                        stack.pop();
                        break;
                    case 6:
                         return true;
             }

             return false;
       }
}
