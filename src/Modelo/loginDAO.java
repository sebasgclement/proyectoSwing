/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase para manejar la autenticación de usuarios en la base de datos.
 */
public class loginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    // Cambié el nombre del constructor para que coincida con el nombre de la clase
    public loginDAO() {
    }

    // Cambié el nombre del método y el tipo de retorno para que coincida con el nombre de la clase
    public login autenticar(String correo, String pass) {
        login l = null; // Declaración inicial de la variable login

        String sql = "SELECT * FROM usuario WHERE correo = ? AND pass = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                l = new login(); // Crear una instancia de login si se encuentra un usuario
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setPass(rs.getString("pass"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            // Siempre debes cerrar la conexión, el PreparedStatement y el ResultSet en un bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

        return l;
    }
}
