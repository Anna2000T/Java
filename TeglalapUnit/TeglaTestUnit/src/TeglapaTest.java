import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeglapaTest {

    Teglapa sc = new Teglapa();

    @Test
    void elsoTeruletTeszt(){

        assertEquals(6,sc.terulet(2,3));

    }
    @Test
    void elsoKeruletTeszt(){

        assertEquals(10,sc.kerulet(2,3));

    }




}