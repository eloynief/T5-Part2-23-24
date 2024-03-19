package ej2;

import java.util.Scanner;

public class Main {
	
	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		//
//		GESTIMAL objeto para modificar su array de dentro
//		GESTISIMAL gest=new GESTISIMAL();
		
		//se crea objeto de la clase Articulo para modificar el array de GESTISIMAL
		Articulo array = null;

		//se crea objeto de la clase Articulo para modificar el array de GESTISIMAL
		Articulo array2= new Articulo();
		
		
		int codigo=0;
		
		String descripcion="";
		
		double precioCompra=0;
		
		double precioVenta=0;
		
		int stock=0;
		
		int opcion=0;
		
		do {
			
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();
			
			//
			switch(opcion) {
			
			case 1:{
				
				//muestra el listado
				GESTISIMAL.listado();
				
				//cierra los casos
				break;
			}
			
			case 2:{
				
				//pedimos los valores de las variables tipo objeto
				array = pedirValores();
				
				//pedimos los valores de las variables tipo objeto
				//array2 = pedirValores();
				
				if(GESTISIMAL.alta(array)){
					System.out.println("El producto se ha añadido correctamente");
				}
				
				

				break;
			}
			
			case 3:{
				//
				System.out.println("Dime el codigo del producto a dar de baja: ");
				
				//
				codigo=sc.nextInt();
				
				
				//
				if(GESTISIMAL.baja(codigo)){
					System.out.println("El producto se ha eliminado correctamente");
				}
				

				break;
			}
			
			case 4:{
				
				//

				//pedimos los valores de las variables tipo objeto
				array = pedirValores();
				
				//pedimos los valores de las variables tipo objeto
				array2 = pedirValores();
				
				//
				if(GESTISIMAL.modificacion(array, array2)) {
					System.out.println("El articulo se ha modificado correctamente");
				}
				
				break;
			}
			
			case 5:{
				
				//
				System.out.println("Escrirbe la cantidad de stock a aumentar:");
				
				//
				stock=sc.nextInt();
				
				//
				System.out.println("Introduce el codigo del articulo a modificar: ");
				
				//
				codigo=sc.nextInt();
				
				//
				if(GESTISIMAL.entradaMercancia(codigo, stock)) {
					System.out.println("El stock se ha modificado correctamente.");
				}
				
				break;
			}
			
			case 6:{
				
				//
				System.out.println("Escrirbe la cantidad de stock a aumentar:");
				
				//
				stock=sc.nextInt();
				
				//
				System.out.println("Introduce el codigo del articulo a modificar: ");
				
				//
				codigo=sc.nextInt();
				
				//
				if(GESTISIMAL.salidaMercancia(codigo, stock)) {
					System.out.println("El stock se ha modificado correctamente.");
				}
				
				break;
			}
			
			case 7:{
				System.out.println("Saliendo del programa...");
				break;
			}
			
			
			}
			
		}while (opcion!=7);
			
	}

	private static Articulo pedirValores() {
		Articulo array;
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		//te pide los datos para introducir
		System.out.println("Dime el codigo: ");
		
		codigo=sc.nextInt();
		
		sc.nextLine();
		
		//
		System.out.println("Dime la descripcion: ");

		descripcion=sc.nextLine();

		
		//
		System.out.println("Dime el precioCompra: ");

		precioCompra=sc.nextDouble();
		
		
		//
		System.out.println("Dime el precioVenta: ");

		precioVenta=sc.nextDouble();

		//
		System.out.println("Dime el stock: ");

		stock=sc.nextInt();
		
		
		
		
		//
		array=new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
		return array;
	}
	
	public static void menu() {
		System.out.println("Artículos");
		System.out.println("===================");
		System.out.println("1 Listado.");
		System.out.println("2 Alta.");
		System.out.println("3 Baja.");
		System.out.println("4 Modif.");
		System.out.println("5 Entrada Mercancia");
		System.out.println("6 Salida Mercancia");
		System.out.println("7 Salir");
		System.out.println("");
	}
	

}
