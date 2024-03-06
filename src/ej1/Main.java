package ej1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
	
	public static void main(String[] args) {
		
		//se rea el array
		Alumno[] alumnos=new Alumno[30];

		//objeto scanner
		Scanner sc=new Scanner(System.in);
		
		//
		String titulo;
		
		//
		String alumnoMod;
		
		
		int opcion=0;
		
		do {
			
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();
			
			//
			switch(opcion) {
			
			case 1:{
				
			}
			
			case 2:{
				
			}
			
			case 3:{
				//
				System.out.println("Dime el nombre del alumno a modificar: ");
				
				//
				alumnoMod=sc.next();
				
				//recorremos el array de alumnos
				for(Alumno alumno :alumnos) {
					//si el nombre del alumno es igual al pedido
					if(alumno.getNombre().equals(alumnoMod)) {
						System.out.println("Dime la nota que le vas a dar al alumno: ");
					}
				}
				
			}
			
			case 0:{
				
			}
			
			
			}
			
		}while (opcion!=0);
		
		
		
		
		
		
	}
	
	
	
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("===================");
		System.out.println("1 Listado.");
		System.out.println("2 Nuevo Alumno.");
		System.out.println("3 Modificar.");
		System.out.println("4 Borrar.");
		System.out.println("5 Salir.");
		System.out.println("");
	}
	
}
