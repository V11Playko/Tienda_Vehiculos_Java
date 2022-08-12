package dao;
/*
* Se encargara de conectarse a la base de datos y enviar los datos del vehiculo
*
*
* */

import database.DbConnection;
import model.VehiculoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VehiculoDAO {

    public static void comprarVehiculoDB(VehiculoModel Vehiculo){
        DbConnection dbconnect = new DbConnection();

        try (Connection conexion = dbconnect.getConnection()){

            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `vehiculos` (`tipo_vehiculo`, `propietario`, `fecha_de_adquisicion`, `color`, `marca`) VALUES (?, ?, ?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, Vehiculo.getTipo_vehiculo());
                ps.setString(2, Vehiculo.getPropietario());
                ps.setString(3, Vehiculo.getFecha_de_adquisicion());
                ps.setString(4, Vehiculo.getColor());
                ps.setString(5, Vehiculo.getMarca());

                ps.executeUpdate();
                System.out.println("Documentos del vehiculo hechos correctamente.");
            }catch (SQLException ex){
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void leerAtributosVehiculoDB(){
        DbConnection dbconnect = new DbConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = dbconnect.getConnection()){
            String query = "SELECT * FROM vehiculos";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println("ID: "+rs.getInt("id_vehiculo"));
                System.out.println("Tipo de vehiculo: "+rs.getString("tipo_vehiculo"));
                System.out.println("Propietario del vehiculo: "+rs.getString("propietario"));
                System.out.println("Fecha de adquisicion: "+rs.getString("fecha_de_adquisicion"));
                System.out.println("Color del vehiculo: "+rs.getString("color"));
                System.out.println("Marca del vehiculo: "+rs.getString("marca"));
                System.out.println(" ");
            }
        }  catch (SQLException e) {
            System.out.println("No se pudieron recuperar los datos.");
            System.out.println(e);
        }

    }

    public static void eliminarVehiculoDB(int id_vehiculo){
        DbConnection dbconnect = new DbConnection();

        try (Connection conexion = dbconnect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM vehiculos WHERE id_vehiculo = ?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1, id_vehiculo);
                ps.executeUpdate();
                System.out.println("El vehiculo ha sido borrado de la base de datos.");

            } catch (Exception e){
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje.");
            }

        }  catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void actualizarVehiculoDB(VehiculoModel Vehiculo){
        DbConnection dbconnect = new DbConnection();

        try (Connection conexion = dbconnect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE vehiculos SET color = ? WHERE id_vehiculo = ?";
                // UPDATE `vehiculos` SET `color` = 'Negro' WHERE `vehiculos`.`id_vehiculo` = 1;
                //UPDATE vehiculos SET id_vehiculo = ? WHERE id_vehiculo = ?
                ps= conexion.prepareStatement(query);
                ps.setString(1, Vehiculo.getTipo_vehiculo());
                ps.setString(2, Vehiculo.getPropietario());
                ps.setString(3, Vehiculo.getFecha_de_adquisicion());
                ps.setString(4, Vehiculo.getColor());
                ps.setString(5, Vehiculo.getMarca());
                ps.executeUpdate();
                System.out.println("Se actualizaron los datos correctamente.");
            } catch (Exception e){
                System.out.println(e);
            }

        }   catch (SQLException e) {
            System.out.println(e);
        }
    }
}
