package ej3;


public class ArrayPizza {

	public static Pizza[] pizzas=new Pizza[50];
	
	

	public static void listarPizzas() {
		for(Pizza p : pizzas) {
			if(p != null) {
				System.out.println(p);
			}
		}
	}
	
	
	
	/**
	 * comprueba si hay una posicion libre o no, es decir, que sea null
	 * @return la comprobacion
	 */
	public static int posLibre() {
		int posicion=-1;
		
		int i=0;
		
		//recorremos el array hasta que el valor sea nulo
		while(i<pizzas.length&&posicion!=-1) {
			if(pizzas[i]==null) {
				//
				posicion=i;
			}
			
		}
		
		
		
		return posicion;
	}
	
	
	public static boolean anadirPizza(Pizza pizza) {
		
		boolean comprobacion=false;
		
		boolean busca;
		
		int i=0;
		
		//recorremos el array hasta que el valor sea nulo
		while(i<pizzas.length&&!comprobacion) {
			if(pizzas[i]==null) {
				
				//
				comprobacion=true;
			}
			
		}
		
		
		
		return comprobacion;
		
	}
	
	
	
}
