package AccesoADatos;

import java.sql.ResultSet;
import java.sql.SQLException;

import Modelos.Estudiante;
import Modelos.Usuarios;

public class GestorDeUsuarios extends GestorDeConeccion {
	
	
	
	
	public GestorDeUsuarios(String NombreUsuario, String Contraseña)
			throws SQLException {
		super(NombreUsuario, Contraseña);

	}

	public ResultSet IngresarUsuarios(Usuarios elUsuario) throws SQLException {

		java.sql.Statement consulta=null;
		ResultSet ResultadoConsulta = null;
		consulta = getConexion().createStatement();
		try {
			ResultadoConsulta = consulta.executeQuery("{call IngresarUsuarios ('"+elUsuario.getPrimerNombre()+"','"+elUsuario.getPrimerApellido()
					+"','"+elUsuario.getSegundoApellido()+"','"+elUsuario.getCarne()+"','"+elUsuario.getContraseña()+"')}");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return ResultadoConsulta;

	}
    public ResultSet EliminarEstudiantes(String Carne) throws SQLException {
    	java.sql.Statement consulta=null;
		ResultSet ResultadoConsulta = null;
		consulta = getConexion().createStatement();
		try {
			ResultadoConsulta = consulta.executeQuery("{call EliminarUsuario ('"+Carne+"')}");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return ResultadoConsulta;
		
	}
}
