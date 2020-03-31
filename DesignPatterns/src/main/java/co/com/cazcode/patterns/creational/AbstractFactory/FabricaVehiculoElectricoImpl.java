package co.com.cazcode.patterns.creational.AbstractFactory;

public class FabricaVehiculoElectricoImpl implements IFabricaVehiculo {

	public FabricaVehiculoElectricoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilElectrico(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {
		return new ScooterElectrico(modelo, color, potencia);
	}

}
