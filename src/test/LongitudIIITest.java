import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongitudIIITest {
    @org.junit.jupiter.api.Test
    void test(){
        assertTrue( LongitudIII.comprueba("1 22 333 22 444 22", 5));
    }

    @org.junit.jupiter.api.Test
    void test2(){
        assertFalse( LongitudIII.comprueba("1 22 333 22 444 22", 3));
    }
}
