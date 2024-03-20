package ej3;

/**
 * Clase que contiene los atributos de la pizza
 */
public class Pizza {
	/*
	 * Enumerados
	 */
	
	/**
	 * Enum para tamano
	 */
	private enum Tamano {
			Mediana, Familiar	
	};
	
	/**
	 * enum de Tipo
	 */
	private enum Tipo {
		Margarita, CuatroQuesos, Funghi		
	};
	
	/**
	 * Enum de Estado
	 */
	private enum Estado {
		Pedida,Servida	
	}
	
	/*
	 * Atributos
	 */
	
	/**
	 * atributo tipo int
	 */
	private int codigo=0;


	/*
	 * atributo tipo Tamano
	 */
	Tamano tamano;
	
	
	/*
	 * atributo tipo Tipo
	 */
	Tipo tipo;
	
	
	/*
	 * atributo tipo Estado
	 */
	Estado estado=Estado.Pedida;
	
	
	/*
	 * Constructores
	 */
	
	public Pizza() {
		//elena te pìde que no lo pongas porque es superclase
//		super();
	}


	
	
	
	
	
	/**
	 * Constructor con todos los parametros
	 * @param codigo
	 * @param tamano
	 * @param tipo
	 * @param estado
	 */
	public Pizza(int codigo, String tamano, String tipo, String estado) {
		//
		if(codigo>=0) {
			//
			this.codigo = codigo;
		}
		
		if(tamano!=null&&!tamano.equals("")) {
			//
			this.tamano = Tamano.valueOf(tamano);
		}
		
		if(tipo!=null&&!tipo.equals("")) {
			//
			this.tipo = Tipo.valueOf(tipo);
		}

		if(estado!=null&&!estado.equals("")) {
			//
			this.estado = Estado.valueOf(estado);
		}
	}








	/*
	 * Getters/Setters
	 */

	/**
	 * 
	 * @return el codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo codigo que le pasamos para modificar el codigo de la pizza
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	


	/**
	 * 
	 * @return el enumerado del Tamano de pizza
	 */
	public Tamano getTamano() {
		return tamano;
	}





	public void setTamano(String tamano) {
		//
		if(tamano!=null&&!tamano.equals("")) {
			//
			this.tamano = Tamano.valueOf(tamano);
		}
	}





	/**
	 * 
	 * @return el enumerado del Tamano de pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		//
		if(tipo!=null&&!tipo.equals("")) {
			//
			this.tipo = Tipo.valueOf(tipo);
		}
	}





	/**
	 * 
	 * @return el enumerado del Tamano de pizza
	 */
	public Estado getEstado() {
		return estado;
	}





	public void setEstado(String estado) {
		if(estado!=null&&!estado.equals("")) {
			//
			this.estado = Estado.valueOf(estado);
		}
	}




	/**
	 * 
	 */
	@Override
	public String toString() {
		
		
		
		String str="";
		str+="Codigo: "+codigo+"\n";
		str+="Tamano: "+tamano+"\n";
		str+="Tipo: "+tipo+"\n";
		str+="ESTATUS brrrr: "+estado+"\n";
		
		
		
		return str;
	};
	
	/**
	 * 
	 * @param 
	 * @return 
	 */
	@Override
	public boolean equals(Object obj) {
		//boolean que comprueba si son iguales
		boolean comprobacion=false;
		//Variable para guardar el cast de obj
		Pizza pizza;
		
		pizza=(Pizza)obj;
		
		if(this.codigo==pizza.codigo) {
			
			comprobacion=true;
			
		}
		
		//se devuelve la comprobacion
		return comprobacion;
	}
	
	
	
	
}
