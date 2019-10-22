package proyectoPersonas;

public class Docente extends Persona {
	
	private Integer dni = 32399840;

	public Docente(String nombre, String apellido) {
		super(nombre, apellido);
		
	}


	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	@Override
	public void identificarse() {
	 System.out.println(String.format("%d: %s, %s", this.dni, this.getNombre(), this.getApellido()));
	}

}
