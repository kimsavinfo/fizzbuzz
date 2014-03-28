import static spark.Spark.*;
import spark.*;

/**
 * Created by kimsavinfo on 28/03/14.
 */
public class Main
{
    public static void main (String [] arg)
    {
        get(new Route("/fizzbuzz") {
            @Override
            public Object handle(Request request, Response response)
            {
                return "fizzbuzz";
            }
        });

        FizzBuzz fizzBuzz= new FizzBuzz();

        for (int i=1; i<=100; i++)
        {
            System.out.println(fizzBuzz.getResult(i));
        }
    }

}
