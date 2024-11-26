public class Fibonacci {

    int fibonacci(int szam){

        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < szam;i++)
        {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return num2;


    }

    
}
