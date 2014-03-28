import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by kimsavinfo on 28/03/14.
 */
public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;

    @Before
    public void SetUp()
    {
        this.fizzBuzz = new FizzBuzz();
    }


    @Test
    public void getResultShouldReturnNumber()
    {
        Assert.assertEquals("1", fizzBuzz.getResult(1));
    }

    @Test
    public void getResultShouldReturnFizz()
    {
        Assert.assertEquals("fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzz()
    {
        Assert.assertEquals("buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void getResultShouldReturnFizzBuzz()
    {
        Assert.assertEquals("fizzbuzz", fizzBuzz.getResult(15));
    }

}
