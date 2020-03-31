package co.com.cazcode.patterns.creational.AbstractFactory;

public abstract class Automovil {
	
	public Automovil(String modelo, String color, int potencia, double espacio) {
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public double getEspacio() {
		return espacio;
	}
	public void setEspacio(double espacio) {
		this.espacio = espacio;
	}
	
	public abstract void mostrarCaracteristicas();
	
	protected String modelo;
	protected String color;
	protected int potencia;
	protected double espacio;
	
}
