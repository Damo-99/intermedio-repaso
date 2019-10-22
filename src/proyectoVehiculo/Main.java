package proyectoVehiculo;

public class Main {

	public static void main(String[] args) {
		
		Moto yamaha = new Moto ("Negra", "Yamaha");
		yamaha.setVelocidadMaxima(120);
         System.out.println(yamaha.velocidadPorRueda());
	}

}
