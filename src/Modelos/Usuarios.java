package Modelos;

public class Usuarios extends Estudiante{
	
	String Contrase�a;


public Usuarios(String carne, String primerNombre, String primerApellido,
			String segundoApellido,String contrase�a) {
		super(carne, primerNombre, primerApellido, segundoApellido);
		this.Contrase�a=contrase�a;
	}


public String getContrase�a() {
	return Contrase�a;
}


public void setContrase�a(String contrase�a) {
	Contrase�a = contrase�a;
}




}
