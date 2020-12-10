 /**
 * Find LAST index of zero
 *
 * @param x array to search
 * @return index of last 0 in x; -1 if absent
 * @throws NullPointerException if x is null
 */
public class LastZero{

   public static int lastZero (int[] x)
   {
      int last = -1;
      for (int i = 0; i < x.length; i++)
      {
         if (x[i] == 0)
         {
            last = i;
         }
      }
      return last;
   }
   
   public static void main (String []argv)
   {
      int []inArr = new int [argv.length];
      if (argv.length == 0)
      {
         System.out.println ("usage: java LastZero n1 n2 n3... ");
         return;
      }
   
      for (int i = 0; i< argv.length; i++)
      {
         try
         {
            inArr [i] = Integer.parseInt (argv[i]);
         }
         catch (NumberFormatException e)
         {
            System.out.println ("Introduce un entero");
            inArr [i] = 1;
         }
      }
   
      System.out.println ("El último cero está en la posición: " + lastZero (inArr));
   }
}