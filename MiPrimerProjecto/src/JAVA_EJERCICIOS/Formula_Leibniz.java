package JAVA_EJERCICIOS;
import java.util.Scanner;

public class Formula_Leibniz {
	public static int solicitarNumeroValido(String mensaje, int minimo, int maximo) {
		

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (s.hasNextInt()) {
                numero = s.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("Número fuera de rango. Intente de nuevo");
                }
            } else {
                s.next();
            }
        }
	}
   
    public static void main(String[] args) {
        int n = solicitarNumeroValido("Ingresa un número entre 10 y 20: ", 10, 20);
        System.out.println("El número ingresado es: " + n);
        
       
        double pi = 0;
         System.out.println("El valor aproximado de PI es:");
        for (int i = 0; i < n; i++) {
            pi += ((Math.pow(-1,i))/(2*i + 1));   
        }
        pi = pi*4; 
        System.out.println(pi);
        System.out.println("Math.PI:");
        System.out.println(Math.PI);
}
}