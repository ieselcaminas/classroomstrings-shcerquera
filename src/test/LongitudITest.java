package test;

import main.LongitudI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LongitudITest {
    @Test
    void test(){
        assertEquals(3, LongitudI.comprueba("1 22 333 22 444 22", 2));
    }
}
