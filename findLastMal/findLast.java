 /**
 * Find LAST index of zero
 *
 * @param x array to search
 * @return index of last 0 in x; -1 if absent
 * @throws NullPointerException if x is null
 */
public class findLast{

   public static int findLast (int[] x, int y)
   { 
      for (int i=x.length-1; i > 0; i--)
      {
         if (x[i] == y) 
         {
            return i;
         }
      }
      return -1;
   }
}