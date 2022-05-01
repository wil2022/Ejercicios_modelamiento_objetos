package Exercise_4;

/**
 * Esta clase define los atributos y el constructor,necesarios para crear objetos del tipo Vehiculo.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Vehicle {

    private Integer passengers;
    private Boolean crew;
    private Integer wheels;
    private String enrollmentDate;
    private String transportMeans;
    private Integer kms;

    /**
     *Constructor
     * @param passengers numero de pasajeros
     * @param crew presencia o ausencia de tripulacion
     * @param wheels numero de ruedas
     * @param enrollmentDate fecha de matriculacion
     * @param transportMeans medio por el que se desplaza
     */
    public Vehicle(int passengers, boolean crew, int wheels, String enrollmentDate, String transportMeans) {
        this.passengers = passengers;
        this.crew = crew;
        this.wheels = wheels;
        this.enrollmentDate = enrollmentDate;
        this.transportMeans = transportMeans;

    }
    /**
     *Metodo para validar si el vehiculo acelero.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public void Accelerate(){
        kms += 1;
    }
    /**
     *Metodo para indicar que el vehiculo freno.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public void Break(){
        kms = 0;
    }

    /**
     * metodo para imprimir los datos del vehiculo
     *
     * @return datos del vehiculo
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return "passengers=" + passengers +
                ", crew=" + crew +
                ", wheels=" + wheels +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", transportMeans='" + transportMeans + '\''
                ;
    }
}
