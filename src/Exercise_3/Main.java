package Exercise_3;

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
     * metodo principal desde el cual se ejecuta el programa.
     *
     * @param args
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static void main(String[] args) {

        System.out.println("\nArreglo original");
        Double[] n = RandomOrder.GenerateArray();
        RandomOrder.PrintArray(n);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n--Con cual metodo desea ordenar el arreglo--\n");
        System.out.println("1. Algoritmo de la burbuja");
        System.out.println("2. Quick sort");

        boolean x = true;
        boolean y = true;

        do {
            try {
                while (y) {
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Arreglo ordenado por el algoritmo de la burbuja");
                            RandomOrder.SortBubbleAlgorithm(n);
                            RandomOrder.PrintArray(n);
                            y = false;
                            break;
                        case 2:
                            System.out.println("Arreglo ordenado por el metodo quicksort");
                            RandomOrder.quickSort(n, 0, n.length - 1);
                            RandomOrder.PrintArray(n);
                            y = false;
                            break;
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                }
                x = false;

            } catch (InputMismatchException e) {
                System.out.println("solo se permite valores numericos: ");
                sc.nextLine();
            }
        } while (x);
    }


}
