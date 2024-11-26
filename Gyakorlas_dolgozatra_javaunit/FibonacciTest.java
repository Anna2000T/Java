import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci sc = new Fibonacci();


    @Test
    void testFibonacci() {

        assertEquals(8, sc.fibonacci(5));

    }
}
