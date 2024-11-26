import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LettersNumberTest {

    LettersNumber sc = new LettersNumber();

    @Test
    void testCountLetters() {
        assertEquals(2,sc.countLetters("ke"));

    }

}
