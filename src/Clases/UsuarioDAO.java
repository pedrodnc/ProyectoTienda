package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO implements IDataBase {
	
	Connection con;

	public UsuarioDAO() {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "patriliProg", "patriliProgramacion");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	@Override
	public Usuario leer(String nombre, String pass) {
		
		try {
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from usuario where nombre='"+nombre+"' pass='"+pass+"'");
			Usuario u =new Cliente();
			u.setNombreAcceso(rs.getString(0));
			u.setPass(rs.getString(1));
			//Rellenar los demas atributos de usuario
			return u;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void grabar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}

}
