package com.company;

public class Empresa extends Cliente {

    public Empresa(String nombre,String direccion,long telefono)
    {
        super(nombre,direccion,telefono);
    }

    @Override
    public String toString() {
        return "\nnombre-->"+this.nombre+
                "\ndireccion-->"+this.direccion+
                "\ntelefono-->"+this.telefono;
    }
}
