public class ParsePostfix
{
       IntStack theStack;
       String in;

       public ParsePostfix(String in)
       {
             this.in = in;
             theStack = new IntStack(in.length() * 2);
       }

       public int doParse()
       {
             char elem;
             int op1, op2, result;

             for(int i = 0; i < in.length(); i++)
             {
                   elem = in.charAt(i);

                   if(elem >= '0' && elem <= '9')
                   {
                         theStack.push((int)(elem - '0'));
                   }
                   else
                   {
                         op1 = theStack.pop();
                         op2 = theStack.pop();

                         switch(elem)
                         {
                              case '+':
                                    result = op1 + op2;
                                    break;
                              case '-':
                                    result = op2 - op1;
                                    break;
                              case '*':
                                    result = op1 * op2;
                                    break;
                              case '/':
                                    result = op2 / op1;
                                    break;
                              default:
                                    result = 0;
                         }

                         theStack.push(result);
                   }
             }

             return theStack.pop();
       }

}
