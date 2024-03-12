package ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//
//		GESTIMAL objeto para modificar su array de dentro
//		GESTISIMAL gest=new GESTISIMAL();
		
		//se crea objeto de la clase ArrayAlmacen para modificar su array de GESTISIMAL
		ArrayAlmacen array= new ArrayAlmacen();
		
		
		//objeto scanner
		Scanner sc=new Scanner(System.in);
		
		int codigo=0;
		
		String descripcion="";
		
		double precioCompra=0;
		
		double precioVenta=0;
		
		int stock=0;
		
		array.llenaValores();
		
		int opcion=0;
		
		do {
			
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();
			
			//
			switch(opcion) {
			
			case 1:{
				
				array.listado();
				break;
			}
			
			case 2:{
				//
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
				
				//si se modifica
				if(array.alta(codigo, descripcion, precioCompra, precioVenta, stock)) {
					System.out.println("El producto se ha añadido correctamente");
				}
				else {
					System.out.println("El codigo del producto ya existe o es 0");
				}

				break;
			}
			
			case 3:{
				//
				System.out.println("Dime el codigo del producto a dar de baja: ");
				
				codigo=sc.nextInt();
				
				if(array.baja(codigo)){
					System.out.println("El producto se ha dado de baja");
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
