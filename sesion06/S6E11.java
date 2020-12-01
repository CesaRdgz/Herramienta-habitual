package sesion06;

import java.util.Scanner;

public class S6E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = sc.nextInt();
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();
        System.out.println("Introduce el carácter");
        char caracter = sc.next().charAt(0);
        for (int j = 0; j < altura; j++) {
            System.out.println();
            for (int i = 0; i < base; i++) {
                System.out.print(caracter + "\t");
            }
        }
    }
}
