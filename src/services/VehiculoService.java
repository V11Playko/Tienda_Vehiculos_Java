package services;

/*
*  Nuestra capa service sera la encargada de pedirnos los datos de los vehiculos
*  y esta enviara sus parametros a la capa dao
*
* */

import dao.VehiculoDAO;
import model.VehiculoModel;

import java.util.Scanner;

public class VehiculoService {

    public static void comprarVehiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Termina la documentacion de tu vehiculo");

        System.out.println("Tipo de vehiculo:");
        String tip_veh = sc.nextLine();

        System.out.println("Nombre del propietario:");
        String nom_propie = sc.nextLine();

        System.out.println("Fecha de adquisicion:");
        String fech_adqui = sc.nextLine();

        System.out.println("Color del vehiculo:");
        String col_veh = sc.nextLine();

        System.out.println("Marca del vehiculo:");
        String mar_veh = sc.nextLine();

        VehiculoModel registroVeh = new VehiculoModel();
            registroVeh.setTipo_vehiculo(tip_veh);
            registroVeh.setPropietario(nom_propie);
            registroVeh.setFecha_de_adquisicion(fech_adqui);
            registroVeh.setColor(col_veh);
            registroVeh.setMarca(mar_veh);

        VehiculoDAO.comprarVehiculoDB(registroVeh);
    }

    public static void listarVehiculos(){

    }

    public static void eliminarVehiculo(){

    }

}
