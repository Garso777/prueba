package JAVA_EJERCICIOS;

public class NumeroPerfecto_Entre_9000 {
    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 2 y 9000: ");
        for(i=2;i <= 9000;i++){  
            suma = 0;
            for(j = 1;j < i;j++){                             
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
          if(i == suma){                         
             System.out.println(i);
          }
        }
    }
}

	

       
            
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        