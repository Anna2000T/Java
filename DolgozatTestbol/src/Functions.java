public class Functions {


    int dividersNumber(int szam) {
        int db = 0;

        if (szam % 1 == 0) {
            db += 1;
        }

        if (szam % 2 == 0) {
            db += 1;

        }

        if (szam % 3 == 0) {
            db += 1;
        }

        if (szam % szam == 0) {
            db += 1;
        }

        return db;


    }

    int maxOfThree(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {

            return b;

        } else if (c > a && c > b) {

            return c;

        }
        return 0;


    }


    Object fizzBuzz(int szam) {


        if (szam % 3 == 0 && szam % 5 == 0) {

            return "FizzBuzz";

        } else if (szam % 3 == 0) {
            return "Fizz";
        } else if (szam % 5 == 0) {
            return "Buzz";

        }
        return 0;
    }


    boolean isVowel(char betu)
    {
        char [] maganhangzok = {'a','e','é','á','o','ö','ü','ó','ú','ű','ő','u','i'};

        for (int i = 0; i < maganhangzok.length;i++)
        {
            if(maganhangzok[i] == betu)
            {
                return true;
            }
        }


        return false;

    }




}








