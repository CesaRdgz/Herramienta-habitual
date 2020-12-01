package sesion05;

import java.util.Scanner;

public class S5E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que casa te puso el sombrero seleccionador");
        System.out.println("1. Griffindor");
        System.out.println("2. Hufflepuff");
        System.out.println("3. Ravenclaw");
        System.out.println("4. Slytherin");
        System.out.println("Selecciona el numero de tu casa");
        int casa = sc.nextInt();
                switch (casa){
                    case 1:
                        System.out.println("Valor");
                        break;
                    case 2:
                        System.out.println("Lealtad");
                        break;
                    case 3:
                        System.out.println("Intelecto");
                        break;
                    case 4:
                        System.out.println("Astucia");
                        break;
                    default:
                        System.out.println("Ese numero no corresponde a ninguna casa");
                        break;
                }
    }
}
