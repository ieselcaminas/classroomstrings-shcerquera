import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiglasTest {

    @Test
    void siglas() {
        assertEquals("EOI", Siglas.convertirASiglas(new String[]{"Escuela", "Oficial", "de", "Idiomas"}));
    }
}