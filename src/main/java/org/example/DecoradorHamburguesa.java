package org.example;

public abstract class DecoradorHamburguesa implements Hamburguesa {
    protected Hamburguesa hamburguesa;

    public DecoradorHamburguesa(Hamburguesa h) {
        this.hamburguesa = h;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion();
    }
}