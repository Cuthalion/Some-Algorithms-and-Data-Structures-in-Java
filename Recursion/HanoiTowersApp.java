public class HanoiTowersApp
{

       public static void main(String[] args)
       {
             doTowers(4, 'A', 'B', 'C');
       }

       public static void doTowers(int top, char from,
            char inter, char to)
       {
            if(top == 1)
                System.out.printf("Disk 1 from %c to %c%n", from, to);
            else
            {
                doTowers(top - 1, from, to, inter);
                System.out.printf("Disk %d from %c to %c%n",top, from, to);
                doTowers(top - 1, inter, from, to);
            }
       }
}
