package com.company;

public class Particular extends Cliente{

    public Particular(String nombre,String direccion,long telefono)
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
