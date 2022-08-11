import services.VehiculoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("--------------------");
            System.out.println(" Tienda de Vehiculos");
            System.out.println(" 1. Listar vehiculos");
            System.out.println(" 2. Comprar vehiculo");
            System.out.println(" 3. Eliminar vehiculo");
            System.out.println(" 4. Salir");

            // leer opcion del usuario
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    VehiculoService.listarVehiculos();
                    break;
                case 2:
                    VehiculoService.comprarVehiculo();
                    break;
                case 3:
                    VehiculoService.eliminarVehiculo();
                    break;
                default:
                    break;
            }

        } while (opcion != 4);


    }
}