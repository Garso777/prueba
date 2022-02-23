package JAVA_EJERCICIOS;
import java.util.*;
public class RaizCuadrada {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double num = 0.0;
		double raizCuadrada = 0.0;
		double operacion = 0.0;
		double total = 0;
		
		
		
		do {
			System.out.print("Interoduce un numero(0 para acbar):");
			num = teclado.nextDouble();
			if(num!=0) {
				raizCuadrada = Math.sqrt(num);
				total +=raizCuadrada;
				operacion = Math.pow(raizCuadrada,3);
				System.out.println();
				
			}
		}
		while(num!=0);
		
	}

}
