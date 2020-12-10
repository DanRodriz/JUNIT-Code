import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
    @Test 
    public void sinCeros() 
    {
        int arr[] = {1, 2, 3};
        assertEquals("Multiple zeroes: should find last one", 0, LastZero.lastZero(arr));
    }
    @Test 
    public void unCero() 
    {
        int arr[] = {1, 0};
        assertEquals("Multiple zeroes: should find last one", 1, LastZero.lastZero(arr));
    }

    @Test 
    public void variosCeros() 
    {
        int arr[] = {0, 1, 0};
        assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
    }
}