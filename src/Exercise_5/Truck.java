package Exercise_5;

import Exercise_4.Vehicle;
/**
 * Esta clase hereda de la clase vehiculo y define
 * los parametros para crear un objeto de tipo Truck.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Truck extends Vehicle {

    private Double height;

    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     * @param height altura del camion
     */
    public Truck(int passengers, boolean crew, int wheels, String enrollmentDate,
                 String transportMeans, Double height) {
        super(passengers, crew, wheels, enrollmentDate, transportMeans);
        this.height = height;
    }
    /**
     * metodo para imprimir los datos del vehiculo tipo Truck
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Truck: " + super.toString() + ", height=" + height;
    }
}
