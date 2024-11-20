public class Teglapa {

    public int terulet(int a, int b)
    {
        if(a > 0 && b < 0)
        {
            throw new NegativeArraySizeException();

        }
        else
        {
            return a * b;
        }
    }

    public int kerulet(int a, int b)
    {
        if(a > 0 && b < 0)
        {
            throw new NegativeArraySizeException();

        }
        else
        {
            return (a + b)*2;
        }

    }

}
