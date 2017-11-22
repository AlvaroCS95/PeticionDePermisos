package AccesoADatos;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;



public class GestorDeConeccion {
  static Connection conexion=null;

	public  GestorDeConeccion(String NombreUsuario, String Contraseña) throws SQLException {
	
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ceper", NombreUsuario, Contraseña);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		GestorDeConeccion.conexion = conexion;
	}
	
	

}
