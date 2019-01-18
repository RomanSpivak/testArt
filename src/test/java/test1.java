import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test1
{
    @Test
    public void factorial_3_6()
    {
        int n = 3;
        int actResult = dz2.factorial(n);
        int expResult = 6;

        assertEquals(expResult, actResult);
    }
    @Test
    public void factorial_0_1()
    {
        int n = 0;
        int actResult = dz2.factorial(n);
        int expResult = 1;

        assertEquals(expResult, actResult);
    }
    @Test
    public void factorial_2_2()
    {
        int n = 2;
        int actResult = dz2.factorial(n);
        int expResult = 2;

        assertEquals(expResult, actResult);
    }
}