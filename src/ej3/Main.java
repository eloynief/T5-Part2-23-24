package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Pizza[] pizza=new Pizza[50];
		
		
		
		//objeto scanner
		Scanner sc=new Scanner(System.in);
		
		int codigo=0;
		
		int tamano=0;
		
		int tipo=0;
		
		int estado=0;
		
		

		
		int opcion=0;
		
		do {
			
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();
			
			//
			switch(opcion) {
			
			case 1:{
				
				//
				System.out.println("");
				
				
				
				
			}
			
			case 2:{
				
			}
			
			case 3:{
				//
				System.out.println("Dime el nombre del alumno a modificar: ");
				
				
				
			}
			
			//no hace falta
//			case 4:{
//				
//			}
			
			
			}
			
		}while (opcion!=4);
		
		
	}
	

	public static void menu() {
		System.out.println("PISSAS / AS");
		System.out.println("===================");
		System.out.println("1 Listado de Pizzas.");
		System.out.println("2 Nuevo Pedido.");
		System.out.println("3 Pizza servida.");
		System.out.println("4 Salir.");
	}

}
