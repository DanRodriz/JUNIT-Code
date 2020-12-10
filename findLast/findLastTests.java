import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTests
{

   @Test 
   public void terceraPosicion() 
   {
      int arr[] = {1, 2, 3, 4, 5};
      int y = 3;
      assertEquals("Última ocurrencia en la posición", 2, findLast.findLast(arr, y));
   }

   @Test 
   public void terceraPosicionError() 
   {
      int arr[] = {3, 2, 3, 4};
      int y = 3;
      assertEquals("Última ocurrencia en la posición", 2, findLast.findLast(arr, y));
   }

   @Test 
   public void primerElementoUltimaOcurrencia() 
   {
      int arr[] = {1, 2, 3};
      int y = 1;
      assertEquals("Última ocurrencia en la posición", 0, findLast.findLast(arr, y));
   }
}