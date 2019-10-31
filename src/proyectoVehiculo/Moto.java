package proyectoVehiculo;

public class Moto extends Vehiculo implements Comparable<Moto> {

	public Moto(String color, String marca) {
		super(color, marca);
	}

	@Override
	public Integer getCantidadRuedas() {
		return 2;

	}

	@Override
	public int compareTo(Moto otraMoto) {

		int miVelocidad = getVelocidadMaxima();
		int velocidadDeLaOtraMoto = otraMoto.getVelocidadMaxima();
		
		// devolver numero positivo si la moto es mas rapida que la del parametro. 
		//Devolver numero negativo si la moto es mas lenta que la del parametro
		// devolver un 0 si tienen la misma velocidad

		return miVelocidad - velocidadDeLaOtraMoto;

	}

}
