package ej2;

public class GESTISIMAL {
	
	/**
	 * 
	 * Se crea un array GESTISIMAL
	 */
	 public static Articulo[] arrayArticulos=new Articulo[20];
	
	
	/**
	 * llena los valores del array con los valores por defecto
	 */
//	public void llenaValores() {
//
//		for(int i=0;i<gest.length;i++) {
//			//imprime los quee no sean null
//			if(gest[i]==null) {
//				//
//				gest[i]=new Articulo();
//			}
//			
//		}
//	}
	
	
	
	/**
	 * 
	 */
	public static void listado() {

		//recorremos el array de articulos mediante un for each
		for(Articulo a:arrayArticulos) {
			//
			if (a!=null) {
				//
				System.out.println(a);
			}
			
		}
		
	}
	
	/**
	 * Alta: Añade el producto
	 * @param codigo recibe el codigo escrito por pantalla
	 * @param desc
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 * @return si el codigo no esta, devuelve true y añade en el array el producto nuevo
	 */
	public static boolean alta(Articulo art) {
		//boolean que se devuelve
		boolean respuesta=false;
		
//		//
//		int i=0;
//		
//		//
//		while(i<gest.length&&!respuesta) {
//			// si no es null y es igual
//			if(gest[i]!=null&&gest[i].equals(art)) {
//				
//			}
//			
//		}
		
		//recorre mientras que la respuesta sea false o hasta que acabe de recorrer toda la tabla
		for(int i=0;i<arrayArticulos.length&&!respuesta;i++) {
			//comprobamos si es null
			if(arrayArticulos[i]==null&&!arrayArticulos[i].equals(art)) {
				//se añade el articulo
				arrayArticulos[i]=art;
				//se vuelve true la respuesta
				respuesta=true;
			}
			
		}
		
		
		
		//se devuelve la respuesta
		return respuesta;
	}
	
	/**
	 * Baja: Borra el articulo pedido
	 * @param codigo
	 * @return
	 */
	public static boolean baja(Articulo art) {
		
		//
		boolean respuesta=false;
		
		//recorre hasta encontrar el 
		for(int i=0;i<arrayArticulos.length&&!respuesta;i++) {
			
			//si coincide con el articulo que pedistes
			if(art.equals(arrayArticulos[i])) {
				
				//hace true la respuesta
				respuesta=true;
				
				//borra el articulo
				arrayArticulos[i]=null;
				
				//hace break
				break;
			}
			
		}
		//
		return respuesta;
	}
	
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public static boolean modificacion(Articulo artActual,Articulo artNuevo) {
		
		
		//
		boolean esModificado=false;
		
		//
		for(int i=0;i<arrayArticulos.length&&!esModificado;i++) {
			
			//si el valor buscado existe
			if (!arrayArticulos[i].equals(null) && arrayArticulos[i]==artActual) {
				
				//le asigamos el valor del articulo nuevo a la posicion del array mediante la llamada de sus metodos
				arrayArticulos[i].setCodigo(artNuevo.getCodigo());
				arrayArticulos[i].setDescripcion(artNuevo.getDescripcion());
				arrayArticulos[i].setPrecioCompra(artNuevo.getPrecioCompra());
				arrayArticulos[i].setPrecioVenta(artNuevo.getPrecioVenta());
				arrayArticulos[i].setStock(artNuevo.getStock());
				
				//asignamos true a es modificado despues de hacer la accion
				esModificado=true;
				
			}
			
		}
		
		//
		return esModificado;
	}
	
	/**
	 * 
	 * @param codigo
	 * @param cantidad
	 * @return
	 */
	public static boolean entradaMercancia(Articulo art,int cantStock) {

		//
		boolean esModificado=false;
		
		//int que recoge el valor del stock del array
		int stockArray=0;

		for(int i=0;i<arrayArticulos.length&&!esModificado;i++) {

			//si el valor buscado existe
			if (!arrayArticulos[i].equals(null) && arrayArticulos[i]==art) {
				
				//asginamos el valor del stock a la variable
				stockArray=arrayArticulos[i].getStock();
				
				//se asigna el valor del stock a la posicion del array
				arrayArticulos[i].setStock(stockArray+cantStock);
				
				//se asigna true una vez modificado
				esModificado=true;
			}
			
			
		}
		
		//
		return esModificado;
		
	}
	
	/**
	 * 
	 * @param codigo
	 * @param cantidad
	 * @return true si hizo la accion de resta, false si no la hizo
	 */
	public static boolean salidaMercancia(int codigo,int cantidad) {
		

		//
		boolean esModificado=false;

		//
		for(int i=0;i<arrayArticulos.length;i++) {
			
			//
			if(arrayArticulos[i].getCodigo()==codigo) {
				
				
				//si se puede hacer la accion
				if(cantidad<arrayArticulos[i].getStock()&&cantidad>0) {
					//se vuelve true
					esModificado=true;
					
					//se le da el valor del stock al stock - cantidad que quieres obtener
					arrayArticulos[i].setStock(arrayArticulos[i].getStock()-cantidad);
					
				}//final if cantidad<gest[i].getStock()&&cantidad>0
			}//final if gest[i].getCodigo()==codigo
			
		}//final for int i=0;i<gest.length;i++
		

		return esModificado;
		
	}
	
	
	
}
