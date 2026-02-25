import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma=0;
        int media;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Dime la dimension de array que quieres usar: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        //Creamos el primer bucle para rellenarlo con numeros aleatorios y después sumándolo a la suma para hacer la media
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100-1);
            System.out.print(numeros[i] + " ");
            suma += numeros[i];
        }
        System.out.println(" ");
        media = suma / numeros.length;
        System.out.printf("Media = %d\n", media);
        System.out.println("Números mayores a la media: ");
        //Con este for comprobamos que si un número es mayor que la media lo muestre.
        for (int numero : numeros) {
            if (numero > media) {
                System.out.print(numero + " ");

            }

        }
        System.out.println(" ");

        sc.close();
        }
    }
