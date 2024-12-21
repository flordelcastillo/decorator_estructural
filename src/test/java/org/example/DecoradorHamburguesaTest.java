package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DecoradorHamburguesaTest {

    @Test
    public void testDecoradorHamburguesa() {
        Hamburguesa base = new HamburguesaBase();
        Hamburguesa decorador = new DecoradorHamburguesa(base) {};
        assertEquals("Carne + Pan", decorador.getDescripcion());
    }
}