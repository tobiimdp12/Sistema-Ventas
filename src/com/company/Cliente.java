package com.company;

public class Cliente {

    private String nombre;
    private String direccion;
    private long telefono;
    private boolean isEmpresa;

    public Cliente(String nombre, String direccion, long telefono,boolean isEmpresa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.isEmpresa = isEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nnombre-->"+this.nombre+
                "\ndireccion-->"+this.direccion+
                "\ntelefono-->"+this.telefono;
    }

    public boolean isEmpresa() {
        return isEmpresa;
    }

    public void setEmpresa(boolean empresa) {
        isEmpresa = empresa;
    }
}
