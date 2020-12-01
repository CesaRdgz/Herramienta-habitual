package sesion05;

import java.util.Scanner;

public class S5E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 9 por escrito: ");
        String nombreNumero = sc.nextLine();
        switch (nombreNumero) {
            case "uno":
                System.out.println('1');
                break;
            case "dos":
                System.out.println('2');
                break;
            case "tres":
                System.out.println('3');
                break;
            case "cuatro":
                System.out.println('4');
                break;
            case "cinco":
                System.out.println('5');
                break;
            case "seis":
                System.out.println('6');
                break;
            case "siete":
                System.out.println('7');
                break;
            case "ocho":
                System.out.println('8');
                break;
            case "nueve":
                System.out.println('9');
                break;
            default:
                System.out.println("No corresponde a ningun numero");
                break;
        }
    }
}