package Tema7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            System.out.println("Resultado: " + (dividendo / divisor));

        } catch (ArithmeticException ex) {
            System.out.println("Error: Imposible dividir por 0");
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
            System.out.println("Traza del error:");
            ex.printStackTrace();

        /*
            }catch (Exception ex){
            ex.printStackTrace();
         */

        /*
            }catch (Throwable ex){
            ex.printStackTrace();
         */
        } catch(InputMismatchException ex) {
            System.out.println("Error: Debes introducir números enteros, no letras.");

        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }
}
