package ej2;

import java.util.Scanner;

public class GESTISIMAL {

	
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
	public GESTISIMAL() {
		
	}
	
	
	public GESTISIMAL(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
//		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setTitulo(int codigo) {
		
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


	@Override
	public String toString() {
		return "GESTISIMAL [titulo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	
}
