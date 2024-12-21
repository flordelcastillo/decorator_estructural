package org.example;

public class Tomate extends DecoradorHamburguesa {
    public Tomate(Hamburguesa h) {
        super(h);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Tomate";
    }
}
