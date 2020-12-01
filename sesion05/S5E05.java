package sesion05;

import java.util.Scanner;

public class S5E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que movimiento quieres hacer?");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        int movimiento = sc.nextInt();
        switch (movimiento){
            case 1:
                System.out.println("Subir");
                break;
            case 2:
                System.out.println("Bajar");
                break;
            case 3:
                System.out.println("Mover a la Izquierda");
                break;
            case 4:
                System.out.println("Mover a la Derecha");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
