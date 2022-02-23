package JAVA_EJERCICIOS;

import javax.swing.JOptionPane;

public class MCM {
    static int mcm(int a, int b){
        int multiplo;
        
        if (a>b)
            multiplo=a;
        else
            multiplo=b;
        while (multiplo%a!=0 || multiplo%b!=0)
            multiplo++;    
        return multiplo;
    }
    
    public static void main(String[] args) {
       int valor1, valor2, resultado;
       try{
           valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer n�mero:"));
           valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo n�mero:"));
           
           resultado=mcm(valor1,valor2);
           
           JOptionPane.showMessageDialog(null, "El m�nimo com�n m�ltiplo de "+valor1+" y "+valor2+" es "+resultado);
       } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Formato de n�mero incorrecto");
       }
    }       
}