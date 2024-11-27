import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FunctionsTest {

    Functions sc = new Functions();

    @Test
    void dividersNumberTEst()
    {
        assertEquals(3,sc.dividersNumber(4));
    }

    @Test
    void dividersNumberTEst2()
    {
        assertEquals(3,sc.dividersNumber(9));
    }


    @Test
    void maxOfThreeTest()
    {
        assertEquals(100,sc.maxOfThree(2,31,100));
    }

    @Test
    void maxOfThreeTest2()
    {
        assertEquals(500,sc.maxOfThree(2,500,100));
    }


    @Test
    void fizzBuzzTest()
    {
        assertEquals("FizzBuzz",sc.fizzBuzz(60));
    }

    @Test
    void fizzBuzzTest2()
    {
        assertEquals("Buzz",sc.fizzBuzz(10));
    }

    @Test
    void fizzBuzzTest3()
    {
        assertEquals("Fizz",sc.fizzBuzz(9));
    }

    @Test
    void isVowelTEst()
    {
        assertEquals(true,sc.isVowel('o'));
    }

    @Test
    void isVowelTEst2()
    {
        assertEquals(true,sc.isVowel('a'));
    }









  
}