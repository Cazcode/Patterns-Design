package co.com.cazcode.patterns.creational.AbstractFactory;

public abstract class Scooter {
	
	public Scooter(String modelo, String color, int potencia) {
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
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
	
	public abstract void mostrarCaracteristicas();
	
	protected String modelo;
	protected String color;
	protected int potencia;
	
}
