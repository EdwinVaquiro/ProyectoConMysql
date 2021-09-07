/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin Sandoval
 */
//singleton
public class ConexionMysql {
    public static ConexionMysql instance;
    private Connection cnn;
    private String pass="",url="jdbc:mysql://localhost:3306/bd_tallerjavaweb",user="root";

    public ConexionMysql() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            cnn= (Connection) DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) 
        {
            System.out.println("Error en la conexión de base de datos: "+ ex.getMessage());
        } catch (SQLException ex) 
        {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static synchronized ConexionMysql getInstance()
    {
        if(instance == null)
        {
            instance= new ConexionMysql();
        }
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }
    
    public void cerrarConexion()
    {
        instance=null;
    }
}
