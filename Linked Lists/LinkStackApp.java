public class LinkStackApp
{
      public static void main(String[] args)
      {

            LinkStack stack = new LinkStack();

            stack.push(5);
            stack.push(9);
            stack.push(18);
            stack.push(31);
            stack.displayStack();

            stack.pop();
            stack.displayStack();
      }
}
