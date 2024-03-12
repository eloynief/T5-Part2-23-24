package ej2;

public class ArrayAlmacen {
	
	/**
	 * 
	 * Se crea un array GESTISIMAL
	 */
	GESTISIMAL[] gest=new GESTISIMAL[20];
	
	
	/**
	 * llena los valores del array con los valores por defecto
	 */
	public void llenaValores() {

		for(int i=0;i<gest.length;i++) {
			//imprime los quee no sean null
			if(gest[i]==null) {
				//
				gest[i]=new GESTISIMAL();
			}
			
		}
	}
	
	
	
	/**
	 * 
	 */
	public void listado() {
		
		for(int i=0;i<gest.length;i++) {
			//imprime los quee no sean null
			if(gest[i].getCodigo()!=0) {
				//
				System.out.println(gest[i].toString());
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param codigo recibe el codigo escrito por pantalla
	 * @param desc
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 * @return si el codigo no esta, devuelve true y añade en el array el producto nuevo
	 */
	public boolean alta(int codigo,String desc, double precioCompra,double precioVenta,int stock) {
		//boolean que se devuelve
		boolean respuesta=false;
		
		//se recorre un for para comprobar si el codigo
//		for(int i=0;i<gest.length;i++) {
//			if(codigo==gest[i].getCodigo()) {
//				continue;
//			}
//		}
		
		//recorremos el array GESTISIMAL
		for(int i=0;i<gest.length;i++) {
			//Comprobar si el codigo del producto existe o no
			if(codigo==gest[i].getCodigo()) {
				//si existe, se hace un break directamente
				break;
			}
			//se encuenta la posicion nula
//			if(gest[i]!=null) {
				
				
				//codigo!=gest[i].getCodigo()&&codigo!=0
				//se comprueba si el codigo es el mismo o no
				if(gest[i].getCodigo()==0&&codigo!=0) {
					//se añaden los datos si el codigo no esta
//					gest[i].setTitulo(codigo);
//					gest[i].setDescripcion(desc);
//					gest[i].setPrecioCompra(precioCompra);
//					gest[i].setPrecioVenta(precioVenta);
//					gest[i].setStock(stock);
					gest[i]=new GESTISIMAL(codigo, desc, precioCompra, precioVenta, stock);
					
					respuesta=true;
//					gest[i].set
					//se sale del bucle
					break;	
				}
				
//			}
			
			
			
		}
		//se devuelve la respuesta
		return respuesta;
	}
	
	
	public boolean baja(int codigo) {
		
		boolean respuesta=false;
		
		for(int i=0;i<gest.length;i++) {
			//si coincide con el codigo que pedistes
			if(codigo==gest[i].getCodigo()) {
				
				respuesta=true;
				
				//hace la accion del recolector de basura
				gest[i]=new GESTISIMAL();
				//hace break
				break;
			}
		}
		return respuesta;
	}
	
	
	/**
	 * 
	 * @param codigo
	 * @return
	 */
	public boolean modificacion(int codigo) {
		
		//
		boolean esModificado=false;
		
		//
		for(int i=0;i<gest.length;i++) {
			
			//
			if(gest[i].getCodigo()==codigo) {
				
				
				
				
				
			}
			
		}
		
		//
		return esModificado;
	}
	
	public boolean entradaMercancia(int codigo,int cantidad) {

		//
		boolean esModificado=false;
		

		return esModificado;
		
	}
	
	/**
	 * 
	 * @param codigo
	 * @param cantidad
	 * @return true si hizo la accion de resta, false si no la hizo
	 */
	public boolean salidaMercancia(int codigo,int cantidad) {
		

		//
		boolean esModificado=false;

		//
		for(int i=0;i<gest.length;i++) {
			
			//
			if(gest[i].getCodigo()==codigo) {
				
				
				//si se puede hacer la accion
				if(cantidad<gest[i].getStock()&&cantidad>0) {
					//se vuelve true
					esModificado=true;
					
					//se le da el valor del stock al stock - cantidad que quieres obtener
					gest[i].setStock(gest[i].getStock()-cantidad);
					
				}//final if cantidad<gest[i].getStock()&&cantidad>0
			}//final if gest[i].getCodigo()==codigo
			
		}//final for int i=0;i<gest.length;i++
		

		return esModificado;
		
	}
	
	
	
}
