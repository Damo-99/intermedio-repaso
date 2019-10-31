package proyectoVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCarrera {

	public static void main(String[] args) {
		ArrayList<Moto> listaMotos = new ArrayList<>();
		
		Moto moto1 = new Moto("Roja", "Toyota");
		
		listaMotos.add(moto1);
		
		Moto moto2 = new Moto("Amarillo", "Yamaha");
		
		listaMotos.add(moto2);
		
		Moto moto3 = new Moto("negra", "motomel");
		
		listaMotos.add(moto3);
		
		Integer minimo = Integer.MAX_VALUE;
		String masLenta = "";
		Integer velocidad = 0;
				
		Scanner scanner = new Scanner(System.in);
		for (Moto moto : listaMotos) {
			System.out.println("Ingrese velocidad: " + moto.getMarca());
			moto.setVelocidadMaxima(scanner.nextInt());
			velocidad = moto.avanzar(120);
			
			if (velocidad == Math.min(velocidad, minimo)) {
				minimo = velocidad;
				masLenta = moto.getMarca();
			}
		}
	
		System.out.println("Moto mas lenta: " + masLenta);
		
	}

}