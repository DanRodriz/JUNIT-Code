import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class testCountPositive
{
   @Test 
   public void arraySinCero() 
   {
      int arr[] = {2, 4, -5, 6};
      assertEquals("Array contains zeroes", 3, countPositive.countPositive(arr));
   }

   @Test 
   public void arrayConCero() 
   {
      int arr[] = {3, 1, 0};
      assertEquals("Array de int con un cero", 3, countPositive.countPositive(arr));
   }

   @Test 
   public void arrayConCeroMal() 
   {
      int arr[] = {3, 1, 0};
      assertEquals("Array de int con un cero", 2, countPositive.countPositive(arr));
   }
}