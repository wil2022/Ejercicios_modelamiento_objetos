package Exercise_5;

import Exercise_4.Vehicle;
/**
 * Esta clase hereda de la clase vehiculo y define
 * los parametros para crear un objeto de tipo Boat.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Boat extends Vehicle {

    private Integer propeller;
    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     * @param propeller numero de propelas de la lancha.
     */
    public Boat(int passengers, boolean crew, int wheels, String enrollmentDate,
                String transportMeans, Integer propeller) {
        super(passengers, crew, wheels, enrollmentDate, transportMeans);
        this.propeller = propeller;
    }
    /**
     * metodo para imprimir los datos del vehiculo tipo Boat.
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Boat: " + super.toString() + ", propeller=" + propeller;
    }
}
