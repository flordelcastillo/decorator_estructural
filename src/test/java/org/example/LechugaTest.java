package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LechugaTest {

    @Test
    public void testLechugaDescripcion() {
        Hamburguesa base = new HamburguesaBase();
        Hamburguesa lechuga = new Lechuga(base);
        assertEquals("Carne + Pan + Lechuga", lechuga.getDescripcion());
    }
}