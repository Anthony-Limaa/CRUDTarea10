package umg.edu.Conexión;

import java.sql.Connection;
import java.sql.DriverManager;

public class clsConexión {

    Connection conn = null;

    String usuario = "root";
    String password = "12345";
    String url = "jdbc:mysql://localhost:3306/tarea10";

    public Connection establecerconexion() {
        try {
            conn = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión" + e);

        }
        return conn;
    }

}
