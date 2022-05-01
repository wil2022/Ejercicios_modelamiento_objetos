package Exercise_2;
/**
 * Clase donde se tiene un metodo main sobrecargado,
 * para que pueda ser llamado desde el main principal.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class Main2 {

     public static void main(int number) {

        if (number >= 18) {
            System.out.println("\nEs mayor de edad - Permitido el ingreso");
        }else{
            System.out.println("\nEs menor - Ingreso no permitido");
        }
    }
}
