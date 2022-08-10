package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {

    public Connection getConnection(){
        Connection myConnection = null;

        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_vehiculos", "root", "");

            if (myConnection != null){
                System.out.println("Conexion Exitosa xD");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return myConnection;
    }

}
