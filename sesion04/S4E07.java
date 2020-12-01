package sesion04;

import java.util.Scanner;

public class S4E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual ha sido tu nota?");
        int nota = sc.nextInt();
        if (nota >= 0 && nota <= 3) {
            System.out.println("MD");
        }else if (nota >= 4 && nota < 5){
            System.out.println("SUF");
        }else if (nota >= 5 && nota <= 6){
            System.out.println("BI");
        }else if (nota >= 7 && nota < 8){
            System.out.println("NOT");
        }else if (nota >= 9 && nota <= 10){
            System.out.println("SOB");
        }

    }
}
