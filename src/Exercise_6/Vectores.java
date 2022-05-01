package Exercise_6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase principal para la ejecucion del programa, el cual consiste en ir ingresando
 * numeros hasta que se ingrese 2 veces seguidas el mismo numero, entonces se muestran
 * los numeros ingresados y termina el programa
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */


public class Vectores {

    /**
     * Vector para agregar los numeros ingresados por el usuario.
     */
    private static Vector<Integer> numbers = new Vector<>();
    private static Scanner input = new Scanner(System.in);

    /**
     * metodo para ir ingresando numeros por teclado,
     * hasta que se ingrese el mismo numero 2 veces seguidas.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static void InputNumbers(){

        Boolean x = true;
        do {
            try {
                System.out.println("ingrese un numero: ");
                Integer num2 = input.nextInt();
                if (num2.equals(numbers.lastElement())) {
                    x = false;
                } else {
                    numbers.add(num2);
                }
            }catch (InputMismatchException e){
                System.out.println("solo se permiten valores numericos");
                input.nextLine();
            }
        }while (x) ;


    }

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

        System.out.println("ingrese un numero: ");
        Integer num = input.nextInt();

        numbers.add(num);

        InputNumbers();

        System.out.println("\n--Numeros ingresados--\n");
        for (Integer i:numbers) {
            System.out.println(i);
        }
    }
}
