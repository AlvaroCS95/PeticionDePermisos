package Modelos;

public class Estudiante {
	
	String Carne,PrimerNombre,PrimerApellido,SegundoApellido;

	public Estudiante(String carne, String primerNombre,
			String primerApellido, String segundoApellido) {
		super();
		Carne = carne;
		PrimerNombre = primerNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
	}

	public String getCarne() {
		return Carne;
	}

	public void setCarne(String carne) {
		Carne = carne;
	}

	public String getPrimerNombre() {
		return PrimerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}

	public String getPrimerApellido() {
		return PrimerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}
	

}
