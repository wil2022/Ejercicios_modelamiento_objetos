package Exercise_5;

import Exercise_4.Vehicle;
/**
 * Esta clase hereda de la clase vehiculo y define
 * los parametros para crear un objeto de tipo Car.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Car extends Vehicle {
    private Integer doors;

    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     * @param doors numero de puertas del carro.
     */
    public Car(int passengers, boolean crew, int wheels, String enrollmentDate,
               String transportMeans, Integer doors) {
        super(passengers, crew, wheels, enrollmentDate, transportMeans);
        this.doors = doors;

    }

    /**
     * metodo para imprimir los datos del vehiculo tipo Car.
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Car: " + super.toString()+ ", doors=" + doors;
    }
}
