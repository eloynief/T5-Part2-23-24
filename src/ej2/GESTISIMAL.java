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
	 * 
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
	public static boolean modificacion(int codigoPasado, int codigo, String descripcion, int precioCompra, int precioVenta, int stock) {
		
		Articulo art;
		
		//
		boolean esModificado=false;
		
		//
		for(int i=0;i<arrayArticulos.length&&!esModificado;i++) {
			
			//si el valor buscado existe
			if (!arrayArticulos[i].equals(null) && arrayArticulos[i].getCodigo()==codigoPasado) {
				
				//le asigamos el valor
				arrayArticulos[i].setCodigo(codigo);
				arrayArticulos[i].setStock(stock);
				arrayArticulos[i].setDescripcion(descripcion);
				arrayArticulos[i].setPrecioCompra(precioCompra);
				arrayArticulos[i].setStock(stock);
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
	public static boolean entradaMercancia(int codigo,int cantidad) {

		//
		boolean esModificado=false;
		
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
