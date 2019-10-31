package proyectoVehiculo;

public class Auto extends Vehiculo {

	public Auto( String color, String marca) {
		super( color, marca);
	}

	@Override
	public Integer getCantidadRuedas() {
	 return 4;
	}

	
}
