import java.util.Scanner;

import javax.lang.model.element.Element;

public class dolgozat3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy számot 10 és 90 között: ");
        int szam = scanner.nextInt();

        if((szam < 10) || (szam > 90))
        {
            System.out.println("A szám helytelen!");


        }
        else
        {
            if(szam % 3 == 0 && szam % 5 != 0)
            {
                System.out.println("Fizz");
            }
            else if(szam % 5 == 0 && szam % 3 != 0)
            {
                System.out.print("Buzz");
            }
            else if(szam % 5 == 0 && szam % 3 == 0 )
            {
                System.out.print("FizzBuzz");
            }
            else if (szam % 5 != 0 && szam % 3 != 0)
            {
                System.out.println(szam);
            }
            

        }


    }
    
}
