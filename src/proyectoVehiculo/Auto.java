package proyectoVehiculo;

public class Auto extends Vehiculo {

	public Auto( String color, String marca) {
		super( color, marca);
	}

	@Override
	public int getRuedas() {
	 return 4;
	}

	
}
