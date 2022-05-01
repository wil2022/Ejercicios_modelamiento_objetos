package Exercise_4;

import java.util.ArrayList;

/**
 * Clase principal para la ejecucion del programa.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Main {
    /**
     * Arreglo para almacenar los vehiculos creados.
     */
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    /**
     *Metodo para crear objetos de tipo vehiculo y agregarlos a un array.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void CreateVehicle() {

        for (int i = 0; i < 10; i++) {

            GeneralData.Data();

            Vehicle vehicle = new Vehicle(GeneralData.getPassengers(), GeneralData.getCrew(), GeneralData.getWheels(),
                    GeneralData.getDate(), GeneralData.getScroll());
            vehicles.add(vehicle);

            System.out.println("vehiculo creado con exito.");
            System.out.println("------------------------------\n");

        }

    }
    /**
     * metodo principal desde el cual se ejecuta el programa.
     *
     * @param args
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void main(String[] args){

        System.out.println("\n---CREACION DE VEHICULOS---\n");

        CreateVehicle();

        System.out.println("\n---VEHICULOS CREADOS---\n");
        for (Vehicle v: vehicles) {
            System.out.println("vehiculo_"+(vehicles.indexOf(v)+1) +" -> "+ v + "\n");
        }
    }

}
