package sesion04;


import java.util.Scanner;

public class S4E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triangulo");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo lado del triangulo");
        int b = sc.nextInt();
        System.out.println("Introduce el tercer lado del triangulo");
        int c = sc.nextInt();
        if (a + b > c){
            System.out.println("Triangulo");
        } else if (a + c > b){
            System.out.println("Triangulo");
        } else if (b + c > a){
            System.out.println("Triangulo");
        } else {
            System.out.println("No triangulo");
            System.exit(0);
        }
    }
}
