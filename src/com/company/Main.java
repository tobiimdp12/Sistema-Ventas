package com.company;

public class Main {

    public static void main(String[] args) {

    	Central central=new Central();
    	//Ingresar por teclado clientes y productos.
		//pongo un boleano en el constructor de cliente para saber si es empresa o no
		//ya que no tiene sentido crear dos nuevas clases si no le vamos a agregar ningun nuevo atributo o metodo

		Cliente particular_1=new Cliente("tobias","x",438732742,false);
		Cliente particular_2=new Cliente("juan","x",438732742,false);
		Cliente particular_3=new Cliente("pamela","x",438732742,false);
		Cliente empresa_1=new Cliente("los mejores","x",438732742,true);
		Cliente empresa_2=new Cliente("los gauchos","x",438732742,true);

		central.todosLosClientes.add(particular_1);
		central.todosLosClientes.add(particular_2);
		central.todosLosClientes.add(particular_3);
		central.todosLosClientes.add(empresa_1);
		central.todosLosClientes.add(empresa_2);

		Producto producto_1=new Producto("jabon",2,23.5);
		central.productosEnStock.add(producto_1);
		Producto producto_2=new Producto("carne",22,24);
		central.productosEnStock.add(producto_2);
		Producto producto_3=new Producto("lechuga",12,44);
		central.productosEnStock.add(producto_3);
		Producto producto_4=new Producto("queso",12,23);
		central.productosEnStock.add(producto_4);
		System.out.println("costo por km 20$");



		//Realice un nuevo pedido por teclado junto con sus validaciones
		central.pedirUnProducto(particular_1,producto_1,20);

		central.pedirUnProducto(particular_1,producto_1,20);
		central.pedirUnProducto(particular_1,producto_1,20);

		central.pedirUnProducto(particular_2,producto_2,20);
		central.pedirUnProducto(particular_2,producto_2,20);
		central.pedirUnProducto(particular_2,producto_2,20);


		central.pedirUnProducto(particular_3,producto_4,20);

		central.pedirUnProducto(empresa_1,producto_4,2);
		central.pedirUnProducto(empresa_1,producto_4,2);
		central.pedirUnProducto(empresa_1,producto_4,2);
		central.pedirUnProducto(empresa_1,producto_4,2);

		central.pedirUnProducto(empresa_2,producto_3,11);
		central.pedirUnProducto(empresa_2,producto_3,11);

		//Realizar 5 ventas por consola y mostrar el promedio de totales vendidos (costo
		//del producto + envío)
		System.out.println("Calculando el promedio de las ventas realizadas");
		central.calcularPromedioVentas();
		System.out.println("cliente al que hay q decirle 'men sos un adicto a comprar en nuestra pagina'");
		//cliente que compro mas
        Cliente c =central.clienteQueMasCompra();
		System.out.println(c.toString());
    }
}
