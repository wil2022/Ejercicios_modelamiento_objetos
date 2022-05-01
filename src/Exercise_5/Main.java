package Exercise_5;

import Exercise_4.GeneralData;
import Exercise_4.Vehicle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
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
    private static Scanner input = new Scanner(System.in);

    /**
     * metodo para crear un objeto de tipo Bicycle.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
   private static void CreateBicycle(){
        System.out.println("de cuantas velocidades es la bicicleta: ");
        Integer cassette = input.nextInt();
        Vehicle bicycle = new Bicycle(GeneralData.getPassengers(), GeneralData.getCrew(), GeneralData.getWheels(),
                GeneralData.getDate(), GeneralData.getScroll(), cassette);

        vehicles.add(bicycle);

    }
    /**
     * metodo para crear un objeto de tipo Boat
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
   private static void CreateBoat(){
        System.out.println("cuantas propelas tiene la lancha: ");
        Integer propeller = input.nextInt();
        Boat boat = new Boat(GeneralData.getPassengers(), GeneralData.getCrew(), GeneralData.getWheels(),
                GeneralData.getDate(), GeneralData.getScroll(), propeller);
        vehicles.add(boat);

    }
    /**
     * metodo para crear un objeto de tipo Car
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    private static void CreateCar(){
        System.out.println("cuantas puertas tiene el carro: ");
        Integer doors = input.nextInt();
        Car car = new Car(GeneralData.getPassengers(), GeneralData.getCrew(), GeneralData.getWheels(),
                GeneralData.getDate(), GeneralData.getScroll(), doors);

        vehicles.add(car);

    }
    /**
     * metodo para crear un objeto de tipo Motorcycle.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    private static void CreateMotorcycle(){

        System.out.println("Cual es la cilindrada de la moto: ");
        Integer cylinder = input.nextInt();
        Motorcycle motorcycle = new Motorcycle(GeneralData.getPassengers(), GeneralData.getCrew(),
                GeneralData.getWheels(), GeneralData.getDate(), GeneralData.getScroll(), cylinder);
        vehicles.add(motorcycle);

    }
    /**
     * metodo para crear un objeto de tipo Truck.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    private static void CreateTruck(){

        System.out.println("cual es la altura del camion: ");
        Double height = input.nextDouble();
        Truck truck = new Truck(GeneralData.getPassengers(), GeneralData.getCrew(), GeneralData.getWheels(),
                GeneralData.getDate(), GeneralData.getScroll(), height);
        vehicles.add(truck);

    }

    /**
     * metodo para crear el vehiculo seleccionado por el usuario.
     *
     * @param option opcion ingresada por el usuario
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static void CreateVehicle(int option) {

        GeneralData.Data();

        switch (option) {
            case 1:
                CreateBicycle();
                break;
            case 2:
                CreateBoat();
                break;
            case 3:
                CreateCar();
                break;
            case 4:
                CreateMotorcycle();
                break;
            case 5:
                CreateTruck();
                break;

        }


    }
    /**
     * metodo principal desde el cual se ejecuta el programa,
     * donde se genera un menu, para que el usuario ingrese una opcion.
     *
     * @param args
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void main(String[] args) {

        System.out.println("\t----CREACION DE VEHICULOS----\n");

        boolean i = true;

        do {
            try {
                System.out.println("-------------------------------");
                System.out.println("\nQue tipo de vehiculo desea crear?\n");
                System.out.println("1. Bicicleta");
                System.out.println("2. Lancha");
                System.out.println("3. Carro");
                System.out.println("4. Moto");
                System.out.println("5. Camion");
                System.out.println("6. Salir del programa");
                System.out.print("ingrese una opcion: ");

                int option = input.nextInt();

                if (option > 0 && option <= 5) {
                    CreateVehicle(option);
                } else if (option == 6) {
                    i = false;
                } else {
                    System.out.println("opcion no valida");
                }
            }catch (InputMismatchException e){
                System.out.println("el valor ingresado no es valido.");
                input.nextLine();
            }
        } while (i);

        System.out.println("\n---Vehiculos creados---\n");

        for (Vehicle v: vehicles) {
            System.out.println(v + "\n");

        }

    }

}
