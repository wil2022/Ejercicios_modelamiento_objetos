package Exercise_1;

/**
 * Esta clase define los atributos y el constructor, para crear objetos del tipo planeta.
 * y los metodos para calcular la atraccion gracitatoria entre 2 cuerpos del sistema.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */

public class Planets {
    /**
     * constante de gravitacion universal.
     */
    private static final double G = 6.67E-11;
    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double sunDistance;

    /**
     *Constructor
     * @param id identificador unico del planeta
     * @param name nombre del planeta
     * @param mass masa del planeta
     * @param density densidad del planeta
     * @param diameter diametro del planeta
     * @param sunDistance la distancia al sol del planeta
     */
    public Planets(int id, String name, double mass, double density, double diameter, double sunDistance) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
    }

    /**
     *
     * @return nombre del planeta
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return la masa del planeta
     */
    public double getMass() {
        return mass;
    }
    /**
     *
     * @return la distancia al sol
     */
    public double getSunDistance() {
        return sunDistance;
    }

    /**
     *Este metodo permite calcular la distancia que hay entre 2 cuerpos del sistema.
     *
     * @param distance1 distancia al sol del primer planeta
     * @param distance2 distancia al sol del segundo planeta
     * @return la distancia entre ambos planetas
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static double CalculateDistance(double distance1, double distance2){

        double max = Math.max(distance1, distance2);
        double min = Math.min(distance1, distance2);

        double distance = max - min;

        return distance;

    }
    /**
     * Este metodo permite calcular la atraccion gravitatoria entre dos cuerpos del sistema.
     *
     * @param mass1 masa del primer planeta
     * @param mass2 masa del segundo planeta
     * @param distance distancia entre ambos planetas.
     * @return atraccion gravitatoria entre los 2 planetas.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static double CalculateAttraction(double mass1, double mass2, double distance){

          double force = (G * mass1 * mass2)/(Math.pow(distance, 2));

          return force;
    }

}
