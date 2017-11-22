package LogicaDeNegocio;

import java.sql.ResultSet;
import java.sql.SQLException;

import sun.awt.windows.WLightweightFramePeer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import AccesoADatos.GestorDeConeccion;
import AccesoADatos.GestorDeUsuarios;
import Modelos.Estudiante;
import Modelos.Usuarios;

public class CoordinadorDeUsuarios extends GestorDeConeccion {
	String NombreU,  Contr;
	public CoordinadorDeUsuarios(String NombreUsuario, String Contraseña)
			throws SQLException {
		super(NombreUsuario, Contraseña);
		this.NombreU=NombreUsuario;
		this.Contr=Contraseña;
		// TODO Auto-generated constructor stub
	}

	public ResultSet IngresarUsuarios(Usuarios elUsuario) throws SQLException {
		
		GestorDeUsuarios elGestorDeUsuarios= new GestorDeUsuarios(NombreU, Contr);
		return elGestorDeUsuarios.IngresarUsuarios(elUsuario);
		
		
	}
	

	public ResultSet EliminarUsuarios(String Carne) throws SQLException {
		
		GestorDeUsuarios elGestorDeUsuarios= new GestorDeUsuarios(NombreU, Contr);
		return elGestorDeUsuarios.EliminarEstudiantes(Carne);
		
		
	}
}
