package ej2;

public class GESTISIMAL {
	
	/**
	 * 
	 * Se crea un array GESTISIMAL
	 */
	Articulo[] gest=new Articulo[20];
	
	
	/**
	 * llena los valores del array con los valores por defecto
	 */
	public void llenaValores() {

		for(int i=0;i<gest.length;i++) {
			//imprime los quee no sean null
			if(gest[i]==null) {
				//
				gest[i]=new Articulo();
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
	public boolean alta(Articulo art) {
		//boolean que se devuelve
		boolean respuesta=false;
		int i=0;
		
		while(i<gest.length&&!respuesta) {
			// si no es null y es igual
			if(gest[i]!=null&&gest[i].equals(art)) {
				
			}
			
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
				gest[i]=new Articulo();
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
