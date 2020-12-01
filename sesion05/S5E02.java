package sesion05;

import java.util.Scanner;

public class S5E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que leguaje de programacion has estudiado?");
        System.out.println("1.Java");
        System.out.println("2.Kotlin");
        System.out.println("3.Scala");
        System.out.println("4.Python");
        System.out.println("Introduce el numero que corresponda al lenguaje que has estudiado");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Bien");
                break;
            case 2:
                System.out.println("Mal");
                break;
            case 3:
                System.out.println("Mal");
                break;
            case 4:
                System.out.println("Mal");
                break;
            default:
                System.out.println("Numero desconocido");
                break;
        }
    }
}