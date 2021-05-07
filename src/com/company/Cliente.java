package com.company;

public  abstract class Cliente {

    protected String nombre;
    protected String direccion;
    protected long telefono;

    public Cliente(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

}
