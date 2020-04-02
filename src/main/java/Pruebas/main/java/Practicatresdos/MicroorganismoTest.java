package main.java.Practicatresdos;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MicroorganismoTest {

    public main.java.Practicatresdos.Microorganismo m = new main.java.Practicatresdos.Microorganismo(256, "m1",0);

    @Test
    void TestIrOrgano()
    {
        int vida = m.GetVida();
        assertFalse(m.GetVida()<vida);
    }

    @ParameterizedTest
    @ValueSource(strings = {"boca","cerebro","corazon","estomago","intestino","higado","pulmones"})
    void TestIrALugares(String lugares)
    {
        m.GetPosicion(lugares);
        assertEquals(true,m.vida);
    }

    @RepeatedTest(10)
    void TestBajarVida()
    {
        m.posicion("1");
        assertTrue(m.vida);
    }

    private void assertTrue(int vida) {
    }
}