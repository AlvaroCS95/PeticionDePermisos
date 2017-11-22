package Modelos;

public class Usuarios extends Estudiante{
	
	String Contraseña;


public Usuarios(String carne, String primerNombre, String primerApellido,
			String segundoApellido,String contraseña) {
		super(carne, primerNombre, primerApellido, segundoApellido);
		this.Contraseña=contraseña;
	}


public String getContraseña() {
	return Contraseña;
}


public void setContraseña(String contraseña) {
	Contraseña = contraseña;
}




}
