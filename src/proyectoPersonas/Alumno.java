package proyectoPersonas;

public class Alumno extends Persona {
     private Integer legajo;

      public Alumno (String nombre, String apellido) {
    	  super (nombre, apellido);
      }
	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	@Override
	public void identificarse() {
		 System.out.println(String.format("%d: %s, %s", this.legajo, this.getNombre(), this.getApellido()));
	}
     
}
