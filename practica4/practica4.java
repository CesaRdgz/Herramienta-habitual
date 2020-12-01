package practica4;

import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del ejercicio: ");
        System.out.println("1. If");
        System.out.println("2. Switch");
        int menuEjercicio = sc.nextInt();
        while (menuEjercicio != 1 && menuEjercicio != 2){
            System.out.println("Opcion incorrecta");
            System.out.println("Introduce el numero del ejercicio: ");
            System.out.println("1. If");
            System.out.println("2. Switch");
            menuEjercicio = sc.nextInt();
        }
        switch (menuEjercicio){

            case 1:
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
                break;
            case 2:
                int numAleatorio = (int) (Math.random() * 100 + 1);
                System.out.println("Introduce un numero entre el 1 y el 100");
                int num = sc.nextInt();
                    if(num == 0) {
                        System.out.println("Te has rendido, el numero era " + numAleatorio);
                        System.exit(0);
                    }else {
                        while (num != numAleatorio) {
                            if(num == 0) {
                                System.out.println("Te has rendido, el numero era " + numAleatorio);
                            } else if  (num > 100){
                                System.out.println("Ese numero no esta dentro del rango de accion");
                            } else if  (num < numAleatorio) {
                                System.out.println("Mayor");
                            } else if (num > numAleatorio) {
                                System.out.println("Menor");
                            }
                            num = sc.nextInt();
                        }
                        System.out.println("Has acertado, el numero era: " + numAleatorio);
                    }
                break;
                }
        }
    }

