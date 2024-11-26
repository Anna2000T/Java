import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramTest {

    Anagram sc = new Anagram();

    char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 's' };

    @Test
    void testIsAnagram() {
        assertEquals(true, sc.isAnagram(str1, str2));

    }
}
