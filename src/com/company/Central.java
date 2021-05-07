package com.company;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Central {
    public ArrayList<Producto> productosEnStock=new ArrayList<>();
    public ArrayList<Double> historialDeVentas=new ArrayList<>(5);
    public ArrayList<Cliente> todosLosClientes=new ArrayList<>();
    public ArrayList<Particular> particu=new ArrayList<>();
    public Central()
    {

    }
    public boolean cofirmarStock(Producto producto)
    {
        for (Producto productoI:productosEnStock) {
            if(productoI.equals(producto))
            {
                if(productoI.getStock()>0)
                {
                    return true;
                }else
                {
                    this.productosEnStock.remove(producto);//como no hay stock
                    return false;
                }
            }
        }
        System.out.println("el producto no fue encontrado");
        return false;//si no encuentra el producto
    }


    public Object clienteQueMasCompra()
    {
        Object mayor=this.todosLosClientes.get(0);
        mayor.toString();


        for (Object i:this.todosLosClientes) {
                //si el cliente i es esta mas veces q el primer cliente de la lista
                if(Collections.frequency(this.todosLosClientes,i)>Collections.frequency(this.todosLosClientes,mayor))
                {
                    mayor=i;
                }

        }
        return mayor;
    }

    public void pedirUnProducto(Object particularOempresa,Producto producto,int kms)
    {

        double costoEnvio=kms*20;
        double costoTotal=0;
        int i=1;
        //Si una empresa realiza un
        //pedido, se le aplica un descuento del 15% en el costo del envío.
        if(particularOempresa instanceof Empresa)
        {
            costoEnvio=costoEnvio-(costoEnvio*0.15);
        }
        Scanner confirmar=new Scanner(System.in);
        if(cofirmarStock(producto))
        {

            System.out.println("Hay stock del producto seleccionado "+producto.nombre);

            costoTotal=costoEnvio+producto.getPrecio();

            System.out.println("Desea confirmar? si/no");
            String x=confirmar.nextLine();
            System.out.println(x);
            if(x.equals("si"))
            {
                System.out.println("venta realizada correctamente");
                this.historialDeVentas.add(costoTotal);
                this.todosLosClientes.add((Cliente) particularOempresa);
                int indice=productosEnStock.indexOf(producto);
                productosEnStock.get(indice).setStock(productosEnStock.get(indice).getStock()-1);

                System.out.println("\n-------------------\n");
            }else
            {
                System.out.println("Lamentamos que no este de acuerdo con el precio :(");
                System.out.println("\n-------------------\n");

            }
        }else
        {
            System.out.println("Lo siento pero ya no tenemos mas existencias de este producto");
            System.out.println("\n-------------------\n");
        }

    }

    public void calcularPromedioVentas()
    {
        double total=0;
        for (double i: this.historialDeVentas) {
            total=total+i;
        }
        System.out.println("El promedio de ventas es:"+Math.round(total/this.historialDeVentas.size()));
    }
}
