public class Anagram
{
      private int size;
      private int count;
      private char[] word;

      public Anagram(String str)
      {
            count = 0;
            size = str.length();
            word = new char[size];
            for(int i = 0; i < size; i++)
                word[i] = str.charAt(i);
            doAnagram(size);
      }

      public void doAnagram(int newSize)
      {
            if(newSize == 1)
                return;
            else
                for(int i = 0; i < newSize; i++)
                {
                      doAnagram(newSize - 1);
                      if(newSize == 2)
                          displayWord();
                      rotate(newSize);
                }
      }

      public void rotate(int rotateNum)
      {
            int savedCharPos = size - rotateNum;
            char temp = word[savedCharPos];

            int i;
            for(i = savedCharPos + 1; i < size; i++)
                 word[i - 1] = word[i];
            word[i - 1] = temp;
      }

      public void displayWord()
      {
            System.out.printf("%d ", ++count);
            for(int i = 0; i < size; i++)
                System.out.printf("%c", word[i]);
            System.out.print(" ");
            if(count % 6 == 0)
                System.out.println();

      }
}
