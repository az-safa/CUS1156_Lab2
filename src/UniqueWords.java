import java.util.ArrayList;

/* Project:   CUS1156_Lab2
 * Class:     UniqueWords.java
 * Author:    Saffah Azeem
 * Date:      February 22, 2026
 * Description: This program counts the number of unique strings in an ArrayList.
 */

public class UniqueWords
{
   /**
      counts the number of unique strings in a list
      @param list ArrayList of strings to be examined
      @return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
      int count = 0;
      
      for (int i = 0; i < list.size(); i++)
      {
         boolean isDuplicate = false;
         // check elements before the current one
         for (int j = 0; j < i; j++)
         {
            // Finding duplicate
            if (list.get(i).equals(list.get(j)))
            {
               isDuplicate = true;
               break; // Stop looking
            }
         }
         
         // Up count if it is not a duplicate
         if (!isDuplicate)
         {
            count++;
         }
      }
      return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");
   
      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}