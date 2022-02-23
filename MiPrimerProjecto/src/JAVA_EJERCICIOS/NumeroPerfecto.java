package JAVA_EJERCICIOS;


public class NumeroPerfecto {
    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 2 y 9000: ");
        for(i=2;i <= 9000;i++){      // i es el número que vamos a comprobar
            suma = 0;
            for(j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1                          
                 if(i % j==0){
                    suma = suma + j; // si es divisor se suma
                 }
            }
          if(i == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
             System.out.println(i);
          }
        }
    }
}

	

       
            
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        