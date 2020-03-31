package co.com.cazcode.patterns.creational.AbstractFactory;

public class AutomovilElectrico extends Automovil {

	public AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
	    System.out.println(  
	      "Automovil Electrico de modelo: " + modelo +   
	      " de color: " + color + " de potencia: " +  
	      potencia + " de espacio: " + espacio);
	}

}
