package ej2;

import java.util.Scanner;

public class Articulo {

	
	/**
	 * titulo del producto
	 */
	private int codigo=0;

	/**
	 * descripcion del producto
	 */
	private String descripcion="";

	/**
	 * precio de compra
	 */
	private double precioCompra=0;

	/**
	 * precio de venta
	 */
	private double precioVenta=0;
	
	/**
	 * nº de unidades
	 */
	private int stock=0;

	
	/**
	 * constructor vacio
	 */
	public Articulo() {
		//le daremos un valor por defecto que no sea 0
		this.stock=5;
		
	}
	
	
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
//		super();
		this.codigo = codigo;
		
		this.descripcion = descripcion;
		if(!descripcion.equals(""))
		
		if(precioCompra>0) {
			this.precioCompra = precioCompra;
		}
		
		if(precioVenta>0) {
			this.precioVenta = precioVenta;
		}
		
		if(stock>=0) {
			this.stock = stock;
		}
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		
		if(codigo>0) {

			this.codigo = codigo;
			
		}
		
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		if(descripcion!=""||descripcion!=null) {
			this.descripcion = descripcion;
		}
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {

		if(precioCompra>0) {
			this.precioCompra = precioCompra;
		}
		
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		
		if(precioVenta>0) {
			this.precioVenta = precioVenta;
		}
		
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		if(stock>=0) {
			this.stock = stock;
		}
	}

	
	

	/**
	 * Metodo que muestra las variables de la clase cuando haces syso
	 * ejemplo:
	 * Codigo: 1
	 * Descripcion: jofknonjobn
	 * ...
	 * 
	 * @return el string con las variables del objeto
	 */
	@Override
	public String toString() {
		return "Articulo [titulo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
	
	
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		
		Articulo art=(Articulo)obj;
		//se igualan mediante el codigo
		//si los codigos coinciden, los articulos son iguales
		if(this.codigo==art.codigo) {
			sonIguales=true;
		}
		
		
//		rerun (exe)
		return sonIguales;
		
	}
	
	
	
}
