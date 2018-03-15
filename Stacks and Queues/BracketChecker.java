public class BracketChecker{

      private String in;

      public BracketChecker(String in)
      {
           this.in = in;
      }

      public boolean check()
      {

            CharStack stack = new CharStack(in.length());
            boolean isMatched = true;

            for(int counter = 0; counter < in.length(); counter++)
            {

                  char ch = in.charAt(counter);

                  switch(ch)
                  {
                      case '{':
                      case '[':
                      case '(':
                           stack.push(ch);
                           break;
                      case '}':
                      case ']':
                      case ')':
                           if(!stack.isEmpty())
                           {
                                char chx = stack.pop();
                                if(ch == '}' && chx != '{' ||
                                   ch == ']' && chx != '[' ||
                                   ch == ')' && chx != '(')
                                      isMatched = false;
                           }
                          else
                          {
                                isMatched = false;
                          }
                          break;

                      default:
                           break;

                  }

            }

            if(!stack.isEmpty())
                isMatched = false;

            return isMatched;
      }
}
