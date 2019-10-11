
import java.util.Scanner;
import java.io.FileReader;

        public class FirstMatch
        {
            public static void main(String[] args)
                    throws java.io.FileNotFoundException
            {

                Scanner in = new Scanner(new FileReader("AliceInWonderland.txt"));
                String longWord = "";
                boolean found = false;

                final int THRESHOLD = 9;


                int position= -1 ;

                while (in.hasNext() && !found)
                {
                    String word = in.next();
                    if (word.length() > THRESHOLD)
                    {
                        longWord = word;
                        found = true;

                    }
                    position++;
                }
                if (found)
                {
                    System.out.println("The first long word is " + longWord + " at position " + position);
                }
                else
                {
                    System.out.println("There are no long words");
                }
            }
        }



