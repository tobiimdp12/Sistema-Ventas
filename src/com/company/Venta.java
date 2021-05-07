package com.company;

import java.util.ArrayList;

public class Venta {

    private double kms;
    public Cliente cliente;
    private Producto nombreProducto;
    private double costoTotal;

    public Venta(Cliente cliente , Producto nombreProducto,double kms,double costoTotal) {
        this.kms = kms;
        this.cliente = cliente;
        this.nombreProducto = nombreProducto;
        this.costoTotal = costoTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "kms=" + kms +
                ", cliente=" + cliente +
                ", nombreProducto=" + nombreProducto +
                ", costoTotal=" + costoTotal +
                '}';
    }
}
