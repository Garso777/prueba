package Pruebas_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JAVA_EJERCICIOS.Cafetera;

class cafetera_PRueba {

	@Test
	void test() {
		Cafetera f=new Cafetera();
		
		assertEquals(f.getCantidadActual(),0);
		assertEquals(f.getCapacidadMaxima(),1000);
	
	}
	
	@Test
	void test2() {
	Cafetera f=new Cafetera(500);
	
	assertEquals(f.getCapacidadMaxima(),500);
	assertEquals(f.getCantidadActual(),500);
	
	
	}
	
	@Test
	
	void test3() {
		Cafetera f=new Cafetera(1000);
		
		assertEquals(f.getCapacidadMaxima(), 1000);
	}
	
	@Test
	
	void test4() {
		Cafetera f=new Cafetera(500);
		assertEquals(f.getCantidadActual(),500);
	}
	

}
