package JAVA_EJERCICIOS;

import java.util.*;

public class CAL_AREA_Circulo {
    
	public static Scanner entrada=new Scanner(System.in);
	 
	public static void main(String[] args) {
		int opcion=-1;
		double base=0,altura=0,radio=0;
 
		while(opcion!=0){
			opcion=menu();
			switch(opcion) {
				case 1:
					
					base=solicitarValor("Indica la base o altura: ");
					System.out.println("\nEl area del cuadrado es " + (base*base));
					break;
				case 2:
					
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.println("\nEl area del rectangulo es " + (base*altura));
					break;
				case 3:
				
					radio=solicitarValor("Indica el radio: ");
					System.out.printf("\nEl area de la circunferencia es %1.2f\n", Math.PI*(Math.pow(radio,2)));
					break;
				case 4:
				
					base=solicitarValor("Indica la base: ");
					altura=solicitarValor("Indica la altura: ");
					System.out.printf("\nEl area del triangulo es %1.2f\n", (base*altura)/2);
					break;
			}
		}
		entrada.close();
	}
 
	private static double solicitarValor(String texto) {
		while(true){
			try {
				System.out.print(texto);
				return entrada.nextDouble();
			}catch(InputMismatchException e) {
			
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
	}
 
	private static int menu() {
		int opcion=-1;
		System.out.println("\n\n---------------------------");
		System.out.println("1-Area de un cuadrado");
		System.out.println("2-Area de un rectangulo");
		System.out.println("3-Area de un circulo");
		System.out.println("4-Area de un trinagulo");
		System.out.println("0-Salir");
		System.out.println("Selecciona una opción");
		while(opcion<0) {
			try {
				opcion=entrada.nextInt();
			}catch(InputMismatchException e) {
				
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
				opcion=-1;
			}
		}
 
		return opcion;
	}

}