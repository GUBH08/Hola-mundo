package ArregleVectoresMatrices;

import java.util.Scanner;

/**
 * Realizar un programa que complete un vector con los N primeros números de la
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión
 * de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno
 * de los números se calcula sumando los dos anteriores a él. Por ejemplo: La
 * sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del
 * número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente… La sucesión de
 * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: Fibonaccin =
 * Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1 para todo n<=1 Por
 * lo tanto, si queremos calcular el término “n” debemos escribir una función
 * que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
 * a ese valor.
 
 * @author ALEXIS.R.L
 */
public class Ejercicio7Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la sucesión de Fibonacci: ");
        int n = input.nextInt();

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.print("La sucesión de Fibonacci es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
