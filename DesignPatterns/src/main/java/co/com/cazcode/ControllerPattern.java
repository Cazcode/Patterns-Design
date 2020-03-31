package co.com.cazcode;

import java.util.Scanner;

import co.com.cazcode.patterns.creational.AbstractFactory.Automovil;
import co.com.cazcode.patterns.creational.AbstractFactory.FabricaVehiculoElectricoImpl;
import co.com.cazcode.patterns.creational.AbstractFactory.FabricaVehiculoGasolinaImpl;
import co.com.cazcode.patterns.creational.AbstractFactory.IFabricaVehiculo;
import co.com.cazcode.patterns.creational.AbstractFactory.Scooter;

public class ControllerPattern {
	public static int nAutos = 3;  
	  public static int nScooters = 2;  	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
	    IFabricaVehiculo fabrica;  
	    Automovil[] autos = new Automovil[nAutos];  
	    Scooter[] scooters = new Scooter[nScooters];  
	    System.out.print("Desea utilizar " +  
	      "vehiculos electricos (1) o a gasolina (2):");  
	    String eleccion = reader.next();  
	    if (eleccion.equals("1"))  
	    {  
	      fabrica = new FabricaVehiculoElectricoImpl();  
	    }  
	    else  
	    {  
	      fabrica = new FabricaVehiculoGasolinaImpl();  
	    }  
	    for (int index = 0; index < nAutos; index++)  
	      autos[index] = fabrica.crearAutomovil("estandar", "amarillo", 6+index, 3.2);  
	    for (int index = 0; index < nScooters; index++)  
	      scooters[index] = fabrica.crearScooter("clasico", "rojo", 2+index);  
	    for (Automovil auto: autos)  
	      auto.mostrarCaracteristicas();  
	    for (Scooter scooter: scooters)  
	      scooter.mostrarCaracteristicas();  
	}
}
