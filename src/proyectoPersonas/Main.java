package proyectoPersonas;

public class Main {

	public static void main(String[] args) {
		Persona pepe = new Persona("Jose", "Joaquin");
		pepe.identificarse();

		Alumno jorge = new Alumno("Martin", "Orona");
		jorge.setLegajo(18443);
		jorge.identificarse();

		Docente tincho = new Docente("Martin", "Lennard");
		tincho.identificarse();
	}
}
