import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kimsavinfo on 28/03/14.
 */
public class FizzBuzzTest
{
    @Test
    public void getResultShouldReturnNumber()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getResult(1));
    }

    @Test
    public void getResultShouldReturnFizz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void getResultShouldReturnFizzBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizzbuzz", fizzBuzz.getResult(15));
    }

}
