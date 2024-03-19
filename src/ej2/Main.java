package ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//
//		GESTIMAL objeto para modificar su array de dentro
//		GESTISIMAL gest=new GESTISIMAL();
		
		//se crea objeto de la clase Articulo para modificar el array de GESTISIMAL
		Articulo array;

		//se crea objeto de la clase Articulo para modificar el array de GESTISIMAL
		Articulo array2= new Articulo();
		
		//objeto scanner
		Scanner sc=new Scanner(System.in);
		
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
				
				//te pide los datos para introducir
				System.out.println("Dime el codigo: ");
				
				codigo=sc.nextInt();
				
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
				
				if(GESTISIMAL.alta(array)){
					System.out.println("El producto se ha añadido correctamente");
				}
				
				

				break;
			}
			
			case 3:{
				//
				System.out.println("Dime el codigo del producto a dar de baja: ");
				
				codigo=sc.nextInt();
				

				if(GESTISIMAL.baja(array)){
					System.out.println("El producto se ha añadido correctamente");
				}
				

				break;
			}
			
			case 4:{

				break;
			}
			
			case 5:{

				break;
			}
			
			case 6:{

				break;
			}
			
			case 7:{

				break;
			}
			
			
			}
			
		}while (opcion!=4);
			
	}
	
	public static void menu() {
		System.out.println("ALUMNOS/AS");
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
