public class Reverser{

      String toReverse;
      String reverse;

      public Reverser(String toReverse)
      {
           this.toReverse = toReverse;
           reverse = "";
      }

      public String reverse()
      {
          CharStack s1 = new CharStack(toReverse.length());

          for(int counter = 0; counter < toReverse.length(); counter++)
          {
                s1.push(toReverse.charAt(counter));
          }

          while(!s1.isEmpty())
          {
               reverse += s1.pop();
          }

          return reverse;
      }
}
