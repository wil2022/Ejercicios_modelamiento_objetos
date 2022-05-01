package Exercise_4;

import java.util.Scanner;
/**
 * Esta clase genera y captura los datos generales,
 * necesarios para crear un objeto de tipo Vehiculo.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class GeneralData {

    private static Integer passengers;
    private static Boolean crew;
    private static Integer wheels;
    private static String date;
    private static String scroll;

    private static Scanner input = new Scanner(System.in);

    /**
     *
     * @return numero de pasajeros
     */
    public static Integer getPassengers() {
        return passengers;
    }

    /**
     *
     * @return si cuenta con tripulacion o no
     */
    public static Boolean getCrew() {
        return crew;
    }

    /**
     *
     * @return numero de ruedas
     */
    public static Integer getWheels() {
        return wheels;
    }

    /**
     *
     * @return fecha de matriculacion
     */
    public static String getDate() {
        return date;
    }

    /**
     *
     * @return medio por el que se desplaza.
     */
    public static String getScroll() {
        return scroll;
    }

    /**
     *Metodo para solicitar por teclado los datos necesarios para crear un vehiculo.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void Data(){

        System.out.println("ingrese la cantidad de pasajeros: ");
        passengers = input.nextInt();
        System.out.println("cuenta con tripulacion (true/false): ");
        crew = input.nextBoolean();
        System.out.println("ingrese la cantidad de ruedas: ");
        wheels = input.nextInt();
        input.skip("\n");
        System.out.println("ingrese la fecha de matriculacion (AAAA/MM/DD): ");
        date = input.nextLine();
        System.out.println("por cual medio se desplaza: ");
        scroll = input.nextLine();

    }
}
