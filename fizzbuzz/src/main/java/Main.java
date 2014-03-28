/**
 * Created by kimsavinfo on 28/03/14.
 */
public class Main
{
    public static void main (String [] arg)
    {
        FizzBuzz fizzBuzz= new FizzBuzz();

        for (int i=1; i<=100; i++)
        {
            System.out.println(fizzBuzz.getResult(i));
        }
    }

}
