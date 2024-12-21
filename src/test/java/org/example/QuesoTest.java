package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuesoTest {

    @Test
    public void testQuesoDescripcion() {
        Hamburguesa base = new HamburguesaBase();
        Hamburguesa queso = new Queso(base);
        assertEquals("Carne + Pan + Queso", queso.getDescripcion());
    }
}