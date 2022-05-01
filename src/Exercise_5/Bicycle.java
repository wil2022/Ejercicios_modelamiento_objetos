package Exercise_5;

import Exercise_4.Vehicle;
/**
 * Esta clase hereda de la clase vehiculo y define
 * los parametros para crear un objeto de tipo Bicycle.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Bicycle extends Vehicle {

    private Integer cassette;

    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     * @param cassette numero de velocidades de la bicicleta.
     */
    public Bicycle(int passengers, boolean crew, int wheels, String enrollmentDate,
                   String transportMeans,Integer cassette) {
        super(passengers, crew, wheels, enrollmentDate, transportMeans);
        this.cassette = cassette;
    }
    /**
     * metodo para imprimir los datos del vehiculo tipo Bicycle
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "Bicycle: "+super.toString()+", cassette=" + cassette;
    }
}
