package com.clases;

public class Producto implements InterfaceProducto{
	
	
	public void imprimeInfo() {
		
		System.out.println("\n\nINFO PRODUCTO\n" +
							"Nombre producto" + InterfaceProducto.nombreProducto +
							"\nCategoria: " + InterfaceProducto.categoria +
							"\nPrecio: " + InterfaceProducto.precio);
	}
	
	public double calcularEnvio() {
		return InterfaceProducto.precio * 2;
	}

}
