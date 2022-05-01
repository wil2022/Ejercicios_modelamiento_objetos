package Exercise_3;

import java.util.Random;
/**
 * Esta clase permite generar un arreglo de numeros reales aleatorios, con
 * la posibilidad de poder ordenarlos mediante el algoritmo de burbuja o el
 * metodo QuickSort.
 *
 * @version  1.0.0 2022-04-30
 *
 * @author  Wilson Pachon - wildavid.pf@gmail.com
 *
 * @since 1.0.0
 */
public class RandomOrder {

    /**
     *Metodo para generar numeros aleatorios y almacenarlos en un array.
     *
     * @return Arreglo de numeros reales aleatorios.
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     *
     */
    public static Double[] GenerateArray() {

        double min = -100;
        double max = 100;

        Random r = new Random();

        Double[] numbers = new Double[10];

        for (int i = 0; i < numbers.length; i++) {
            double randomValue = min + (max - min) * r.nextDouble();

            numbers[i] = randomValue;

        }

        return numbers;
    }
    /**
     * Metodo para ordenar un array de numeros, mediante
     * el algoritmo de la burbuja.
     *
     * @param numbers arreglo de numeros
     *
     * @author Wilson Pachon - wildavid.pf@gmail.com
     * @since 1.0.0
     */
    public static void SortBubbleAlgorithm(Double[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < (numbers.length - 1 - i); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Double aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
    }

    /**
     *Metodo para ordenar un array de numeros, mediante
     *el metodo QuickSort.
     *
     * @param numbers arreglo de numeros
     * @param start valor inicial del metodo.
     * @param end tamaño del arreglo menos uno
     *
     *@author Wilson Pachon - wildavid.pf@gmail.com
     *@since 1.0.0
     */
    public static void quickSort(Double[] numbers, int start, int end){

        if(start >= end) return;
        Double pivot = numbers[start];
        int leftElem = start+1;
        int rightElem = end;
        while(leftElem <= rightElem){
            while(leftElem <= end && numbers[leftElem] < pivot){
                leftElem ++;
            }
            while(rightElem > start && numbers[rightElem] >= pivot){
                rightElem --;
            }
            if(leftElem < rightElem){
                Double temp1 = numbers[leftElem];
                numbers[leftElem] = numbers[rightElem];
                numbers[rightElem] = temp1;
            }
        }

        if(rightElem > start){
            Double temp2 = numbers[start];
            numbers[start] = numbers[rightElem];
            numbers[rightElem] = temp2;
        }
        quickSort(numbers, start, rightElem-1);
        quickSort(numbers, rightElem+1, end);

    }
    /**
     *metodo para imprimir el arreglo.
     *
     * @param n arreglo de numeros
     *
     *@author Wilson Pachon - wildavid.pf@gmail.com
     *@since 1.0.0
     */
    public static void PrintArray(Double[] n){
        for (Double i : n) {
            System.out.print(String.format("%.2f",i) + "  ");
        }
    }
}
