package JAVA_EJERCICIOS;

public class Cafetera {
	private int capacidadMaxima; 
	private int cantidadActual;

	public Cafetera() { 
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	public Cafetera(int capacidad) { 
		capacidadMaxima = capacidad; 
		cantidadActual = capacidadMaxima;
	}

	public Cafetera(int capacidad, int cantidad) { 
		this.capacidadMaxima = capacidad; 
		
	}

	public int getCapacidadMaxima() { return capacidadMaxima; } 

	public int getCantidadActual() { return cantidadActual; } 

	public void setCapacidadMaxima(int c) { 
		//probar que la cantidad en el depósito no sea mayor que la capacidad máxima
		capacidadMaxima = c;
		
	}
	public void setCantidadActual(int c) { 
		
			cantidadActual = c;
	}

	public void llenarCafetera() { 
		cantidadActual = capacidadMaxima;
	}

	public int servirTaza(int cc) { 
		int servido=0; 
		if(cantidadActual == 0) {
			System.out.println("Lo siento, pero no queda nada de café."); 
			servido = 0;
		}
	else 
	  if(cantidadActual <= cc) {
		System.out.println("Se ha servido todo lo que quedaba ("+ 
						cantidadActual + " c.c.)"); 
		servido = cantidadActual; 
		cantidadActual = 0;

	  }
  else { 
		servido = cc;
		cantidadActual -= cc; 
		System.out.println("Todavia quedan "+ cantidadActual + " c.c.");
	   }
	  return servido;
	}

	public void vaciarCafetera() { 
		cantidadActual = 0;
	}

	public void agregarCafe(int cc) { 
		
		cantidadActual += cc;	
	}

	public String toString() {
		return "Capacidad = " + capacidadMaxima+ " Cantidad actual = " + cantidadActual;
	}
}
