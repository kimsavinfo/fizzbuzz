/**
 * Created by kimsavinfo on 28/03/14.
 */
public class FizzBuzz
{
    public String getResult(int p_numero)
    {
        String result = Integer.toString(p_numero);

        if( isFizz(p_numero) || isBuzz(p_numero))
        {
            result = "";
            if(isFizz(p_numero))
            {
                result += "fizz";
            }
            if (isBuzz(p_numero))
            {
                result += "buzz";
            }
        }

        return  result;
    }

    public boolean isFizz(int p_numero)
    {
        if( p_numero % 3 == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isBuzz(int p_numero)
    {
        if( p_numero % 5 == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
