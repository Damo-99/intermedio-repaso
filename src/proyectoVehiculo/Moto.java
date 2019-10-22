package proyectoVehiculo;

public class Moto extends Vehiculo {

	
	public Moto( String color, String marca) {
		super( color, marca);
	}
     
   	
	@Override
	public int getRuedas() {
		return 2;
		
	}

	
}
