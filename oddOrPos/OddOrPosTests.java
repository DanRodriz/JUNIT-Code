import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTests
{

   @Test 
   public void OddNumbers() 
   {
      int arr[] = {1, 6};
      assertEquals("Negative odd numbers in array", 2, OddOrPos.oddOrPos(arr));
   }

   @Test 
   public void notOddNumbers() 
   {
      int arr[] = {-2, 3, 6};
      assertEquals("Negative odd numbers in array", 1, OddOrPos.oddOrPos(arr));
   }

   @Test 
   public void negativeOddNumbers() 
   {
      int arr[] = {-3, -2, 0, 1, 4};
      assertEquals("Negative odd numbers in array", 3, OddOrPos.oddOrPos(arr));
   }
}