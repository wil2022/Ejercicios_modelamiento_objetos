package Exercise_5;

import Exercise_4.Vehicle;
/**
 * Esta clase hereda de la clase vehiculo y define
 * los parametros para crear un objeto de tipo Motorcycle
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Motorcycle extends Vehicle {

private Integer cylinderCapacity;

    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     * @param cylinderCapacity Cilindrada de la moto
     */
    public Motorcycle(int passengers, boolean crew, int wheels, String enrollmentDate,
                      String transportMeans, Integer cylinderCapacity) {
        super(passengers, crew, wheels, enrollmentDate, transportMeans);
        this.cylinderCapacity = cylinderCapacity;
    }
    /**
     * metodo para imprimir los datos del vehiculo tipo Motorcycle.
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Motorcycle: " + super.toString() + ", cylinderCapacity=" + cylinderCapacity;
    }
}
