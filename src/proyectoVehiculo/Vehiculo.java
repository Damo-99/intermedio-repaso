package proyectoVehiculo;

public class Vehiculo {
	private int ruedas;
	private String color;
	private String marca;
	Integer cantidadMarchas;
	Integer velocidadMaxima;

	public Vehiculo(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	public Integer getCantidadMarchas() {
		return cantidadMarchas;
	}

	public void setCantidadMarchas(Integer cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public float velocidadPorMarcha() {
		float laVelocidad = velocidadMaxima / cantidadMarchas;
		 return laVelocidad;
	}
	
	public float velocidadPorRueda() {
	float	laVelocidadPorRueda = velocidadMaxima / this.getRuedas(); 
	return laVelocidadPorRueda;
	}
}
