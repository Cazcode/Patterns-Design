package co.com.cazcode.patterns.creational.AbstractFactory;

public class ScooterElectrico extends Scooter {

	public ScooterElectrico(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
	    System.out.println(  
	      "Automovil Electrico de modelo: " + modelo +   
	      " de color: " + color + " de potencia: " +  
	      potencia);
	}

}
