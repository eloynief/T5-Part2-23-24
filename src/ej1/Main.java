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
		
		String nombre="";
		
		int notaMedia=0;
		
		int opcion=0;
		
		

		//recorremos el array de alumnos
		for(int i=0;i<alumnos.length;i++) {
			
			//l easignamos el valor dekl nomrbe y la nota media
			alumnos[i]=new Alumno("",0);
			
		}
		
		
		do {
			
			menu();
			
			System.out.print("Elige una opcion: ");
			//
			opcion=sc.nextInt();
			
			//
			switch(opcion) {
			
			case 1:{
				
				//recorremos el array de alumnos
				for(Alumno alumno :alumnos) {
					
					System.out.println(alumno);
					
				}
				
				
				break;
			}
			
			case 2:{
				
				for(int i=0;i<alumnos.length;i++) {
					//si la posicion no tene nombre
					if(alumnos[i].getNombre()=="") {
						//pedimos que escribamos el nombre / nota mrdai del alumno
						System.out.println("Escribe el nombre del alumno: ");
						nombre=sc.next();
						sc.nextLine();
						
						System.out.println("Escribe la media del alumno: ");
						notaMedia=sc.nextInt();
						sc.nextLine();
						
						//l easignamos el valor dekl nomrbe y la nota media
						alumnos[i]=new Alumno(nombre,notaMedia);
						
						break;
						
					}
				}

				break;
			}
			
			//modificar
			case 3:{
				//
				System.out.println("Dime el nombre del alumno a modificar: ");
				
				//
				alumnoMod=sc.next();
				
				//recorremos el array de alumnos
				for(int i=0;i<alumnos.length;i++) {
					//si el nombre del alumno es igual al pedido
					if(alumnos[i].getNombre().equals(alumnoMod)&&alumnos[i]!=null) {
						System.out.println("Dime la nota que le vas a dar al alumno: ");
						notaMedia=sc.nextInt();
						
						alumnos[i].setNotaMedia(notaMedia);
						
					}
				}
				
				break;
			}
			
			//4
			case 4:{

				//
				System.out.println("Dime el nombre del alumno a modificar: ");
				
				//
				alumnoMod=sc.next();
				sc.nextLine();
				
				//recorremos el array de alumnos
				for(int i=0;i<alumnos.length;i++) {
					//si el nombre del alumno es igual al pedido
					if(alumnos[i].getNombre().equals(alumnoMod)) {
						
						//se vuelve null
						alumnos[i].setNombre(nombre);
						alumnos[i].setNotaMedia(notaMedia);;
					}
				}
				
				break;
			}

			
			//(caso extra para llenar el array de alumnos)
			case -1:{
				

				//recorremos el array de alumnos
				for(int i=0;i<alumnos.length;i++) {
					
					//l easignamos el valor dekl nomrbe y la nota media
					alumnos[i]=new Alumno("UsuarioNuevo",i);
					
				}
				
				break;
			}
			
			
			//0
			case 0:{
				
			}
			
			
//			break;
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
		System.out.println("-1: Llenar usuarios con UsuarioNuevo");
		System.out.println("0 Salir.");
		System.out.println("");
	}
	
}
