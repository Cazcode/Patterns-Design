package co.com.cazcode.patterns.creational.AbstractFactory;

public interface IFabricaVehiculo {
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);
	public Scooter crearScooter(String modelo, String color, int potencia);
}
