/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import conexiones.ConexionMysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin Sandoval
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionMysql com = ConexionMysql.getInstance();
        PreparedStatement psnt = null;
        ResultSet resultado = null;
        try {
            psnt = com.getCnn().prepareStatement("select * from tb_producto;");
            resultado = psnt.executeQuery();
            while(resultado.next())
            {
                System.out.println(resultado.getString("nombre_producto"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta BD: "+ ex.getMessage());
        }finally
        {
            try {
                if(psnt!=null)
                {
                    psnt.close();
                    
                }
                if(resultado!=null)
                {
                   resultado.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error en cerrar la conexión: "+ ex.getMessage());
            }
            com.cerrarConexion(); 
        }
    }
    
}
