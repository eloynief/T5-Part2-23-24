package ej3;

/**
 * Clase que contiene los atributos de la pizza
 */
public class Pizza {

	/**
	 * 
	 */
	private int codigo=0;

	/**
	 * 
	 */
	private enum Tamano {
			Mediana, Familiar	
	};
	
	Tamano tamano;
	
	/**
	 * 
	 */
	private enum Tipo {
		Margarita, CuatroQuesos, Funghi		
	};
	
	Tipo tipo;
	
	/**
	 * 
	 */
	private enum Estado {
		Perdida,Servida	
	}

	Estado estado;
	
	
	
	
	public Pizza(int codigo) {
		//elena te pìde que no lo pongas porque es superclase
//		super();
		this.codigo = codigo;
	}






	public int getCodigo() {
		return codigo;
	}






	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	



	@Override
	public String toString() {
		
		
		
		String str="";
		str+="Codigo: "+codigo+"\n";
		str+="Tamano: "+tamano+"\n";
		str+="Tipo: "+tipo+"\n";
		str+="ESTATUS brrrr: "+estado+"\n";
		
		
		
		return str;
	};
	
	
	
	
	
}
