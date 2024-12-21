package org.example;

public class Main {
    public static void main(String[] args) {

        Hamburguesa hamburguesaCompleta = new HamburguesaBase();
        hamburguesaCompleta = new Queso(hamburguesaCompleta);
        hamburguesaCompleta = new Lechuga(hamburguesaCompleta);
        hamburguesaCompleta = new Tomate(hamburguesaCompleta);

        Hamburguesa hamburguesaSimple = new HamburguesaBase();

        Hamburguesa hamburguesaDobleQueso = new HamburguesaBase();
        hamburguesaDobleQueso = new Queso(hamburguesaDobleQueso);
        hamburguesaDobleQueso = new Queso(hamburguesaDobleQueso);

        System.out.println("--------------------");
        System.out.println("Hamburguesa Completa: " + hamburguesaCompleta.getDescripcion());
        System.out.println("--------------------");
        System.out.println("Hamburguesa Simple: " + hamburguesaSimple.getDescripcion());
        System.out.println("--------------------");
        System.out.println("Hamburguesa Doble Queso: " + hamburguesaDobleQueso.getDescripcion());
    }
}
