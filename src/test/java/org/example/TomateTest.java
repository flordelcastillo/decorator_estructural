package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TomateTest {

    @Test
    public void testTomateDescripcion() {
        Hamburguesa base = new HamburguesaBase();
        Hamburguesa tomate = new Tomate(base);
        assertEquals("Carne + Pan + Tomate", tomate.getDescripcion());
    }
}