package co.com.cazcode.patterns.creational.AbstractFactory;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
	    System.out.println(  
	      "Automovil de gasolina de modelo: " + modelo +   
	      " de color: " + color + " de potencia: " +  
	      potencia);
	}

}
