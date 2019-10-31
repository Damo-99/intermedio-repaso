package proyectoVehiculo;
import java.util.Comparator;

public class ComparadorVelocidad implements Comparator<Vehiculo> {
    
	@Override
	public int compare(Vehiculo a1, Vehiculo a2) {
		return (int) a1.velocidadMaximaPorRueda() - (int) a2.velocidadMaximaPorRueda();
	}
}
