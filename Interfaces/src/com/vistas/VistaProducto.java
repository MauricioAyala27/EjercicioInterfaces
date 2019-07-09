package com.vistas;

import com.clases.Producto;

public class VistaProducto {

	public static void main(String[] args) {
		
		Producto p = new Producto();
	
		p.imprimeInfo();
		System.out.println("El Total del Envio es: " + p.calcularEnvio());
		

	}

}
