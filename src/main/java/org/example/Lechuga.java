package org.example;

public class Lechuga extends DecoradorHamburguesa {
    public Lechuga(Hamburguesa h) {
        super(h);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Lechuga";
    }
}