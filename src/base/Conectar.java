package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar
 */
public class Conectar
{

    Connection enlazar = null;

    public Connection conectar()
    {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost/panaderirosita", "root", "");

        } catch (ClassNotFoundException ex)
        {
            System.out.println("error de conexion " + ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enlazar;
    }
}
