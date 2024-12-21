package org.example;

public class Queso extends DecoradorHamburguesa {
    public Queso(Hamburguesa h) {
        super(h);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Queso";
    }
}
