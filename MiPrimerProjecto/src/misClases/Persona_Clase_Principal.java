package misClases;

public class Persona_Clase_Principal {
	public static void main(String[] args) {
        Persona persona1=new Persona("José Roberto", "Jiménez", "Hernández", 'H', 20, "Av. El aguacate #41");
        Persona persona2=new Persona("Mayra", "Espinosa", "Sánchez", 'M', 17, "Fracc. La noche es larga #221");
        Persona persona3=new Persona("Armando", "Ruiz", "López", 'H', 33, "Calle patitos feos #87");
        
        System.out.println(persona1.mostrarDatos(persona1));
        persona1.mayorEdad(20);
        
        System.out.println(persona2.mostrarDatos(persona2));
        persona2.mayorEdad(17);
        
        System.out.println(persona3.mostrarDatos(persona3));
        persona3.mayorEdad(33);
        
        /*******************************************************/
        //Sentencias para las preguntas
        Persona persona4=new Persona();
        System.out.println(persona4.mostrarDatos(persona4));
        
        Persona persona5=new Persona(persona1);
        System.out.println(persona5.mostrarDatos(persona5));
        
        System.out.println(persona1.mostrarDatos(persona3));

	}


}
