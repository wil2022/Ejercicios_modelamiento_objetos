package Exercise_1;

import java.util.ArrayList;
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
     * Arreglo para almacenar los planetas creados.
     */
    private static ArrayList<Planets> planets = new ArrayList<>();

    /**
     * Este metodo solicita los datos necesarios para crear un planeta.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static void CreatePlanets() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nIngrese los datos de 2 planetas\n");
        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese el id: ");
            Integer id = input.nextInt();
            input.skip("\n");
            System.out.println("ingrese el nombre del planeta: ");
            String name = input.nextLine();
            System.out.println("ingrese la masa (kgs): ");
            Double mass = input.nextDouble();
            System.out.println("ingrese la densidad: ");
            Double density = input.nextDouble();
            System.out.println("ingrese el diametro: ");
            Double diameter = input.nextDouble();
            System.out.println("ingrese la distancia al sol (kms): ");
            Double sunDistance = input.nextDouble();

            Planets planet = new Planets(id, name, mass, density, diameter, sunDistance);

            planets.add(planet);

            System.out.println("---------------------");

        }
    }

    /**
     * metodo principal donde se ejecuta el programa.
     *
     * @param args
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void main(String[] args) {

        CreatePlanets();

        Double d = Planets.CalculateDistance(planets.get(0).getSunDistance(), planets.get(1).getSunDistance());

        System.out.println("la distancia entre "+planets.get(0).getName()+ " y "+
                            planets.get(1).getName()+ " es: "+d + " kms.");

        System.out.println("la atraccion gravitatoria entre los 2 planetas es: "+
                Planets.CalculateAttraction(planets.get(0).getMass(), planets.get(1).getMass(), d)+" newtons");
    }
}
