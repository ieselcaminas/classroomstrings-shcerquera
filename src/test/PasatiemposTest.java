import org.junit.jupiter.api.Test;

class PasatiemposTest {

    @Test
    void crearPasatiempo() {
        assertEquals(".n .j.mpl. d. p.s.t..mp.s", Pasatiempos.crearPasatiempo("un ejemplo de pasatiempos"));
    }
}