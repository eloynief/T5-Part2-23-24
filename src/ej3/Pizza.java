package ej3;

public class Pizza {

	/**
	 * 
	 */
	private int codigo=0;

	/**
	 * 
	 */
	private enum tamano {
			Mediana, Familiar	
	};
	
	/**
	 * 
	 */
	private enum tipo {
		Margarita, CuatroQuesos, Funghi		
	};
	
	/**
	 * 
	 */
	private enum estado {
		Perdida,Servida	
	}

	
	
	
	
	
	public Pizza(int codigo) {
		//elena te pìde que no lo pongas porque es superclase
//		super();
		this.codigo = codigo;
	}






	@Override
	public String toString() {
		String str="";
		str+="Codigo: "+codigo+"\n";
		
		
		
		return str;
	};
	
	
	
	
	
}
