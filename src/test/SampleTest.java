package test;

import main.Sample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void suma() {
       assertEquals(5, Sample.suma(2, 3));
    }

}