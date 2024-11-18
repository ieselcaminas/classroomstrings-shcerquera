import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasatiemposTest {

    @Test
    void crearPasatiempo() {
        assertEquals(".n .j.mpl. d. p.s.t..mp.s", Pasatiempos.pasaTiempos("un ejemplo de pasatiempos"));
    }
}