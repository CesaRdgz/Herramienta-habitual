package sesion02;

import java.util.Scanner;

public class S2E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero");
        int num4 = sc.nextInt();
        int media = ((num1 + num2 + num3 + num4) / 4);
        System.out.println("La media de los cuatro numeros es: " + media);
    }
}
