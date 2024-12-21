package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HamburguesaTest {
    @Test
    public void testHamburguesaBaseDescripcion() {
        Hamburguesa hamburguesa = new HamburguesaBase();
        assertEquals("Carne + Pan", hamburguesa.getDescripcion());
    }
}