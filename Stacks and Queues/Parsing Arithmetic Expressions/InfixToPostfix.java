public class InfixToPostfix
{
       private Stack theStack;
       private String in;
       private String out;

       public InfixToPostfix(String in)
       {
              this.in = in;
              theStack = new Stack(in.length());
              out = "";
       }

       public String toPostfix()
       {

              for(int i = 0; i < in.length(); i++)
              {
                     char elem = in.charAt(i);

                     switch(elem)
                     {
                            case '+':
                            case '-':
                                  gotOperand(elem, 1);
                                  break;
                            case '*':
                            case '/':
                                  gotOperand(elem, 2);
                                  break;
                            case '(':
                                  theStack.push(elem);
                                  break;
                            case ')':
                                  gotParenthesis();
                                  break;
                            default:
                                  out += elem;
                                  break;
                     }
              }

              while(!theStack.isEmpty())
              {
                     out += theStack.pop();
              }

              return out;
       }

       public void gotOperand(char elem, int precedence)
       {

              while(!theStack.isEmpty())
              {
                     char topElem = theStack.pop();

                     if(topElem == '(')
                     {
                             theStack.push(topElem);
                             break;
                     }

                     else
                     {
                             int topPrecedence;
                             if(topElem == '+' || topElem == '-')
                                  topPrecedence = 1;
                             else
                                  topPrecedence = 2;

                             if(topPrecedence < precedence)
                             {
                                  theStack.push(topElem);
                                  break;
                             }

                             else
                                  out += topElem;
                     }
              }

              theStack.push(elem);
       }

       public void gotParenthesis()
       {

              while(!theStack.isEmpty())
              {
                    char topElement = theStack.pop();
                    if(topElement == '(')
                         break;
                    else
                         out += topElement;
              }
       }

}
