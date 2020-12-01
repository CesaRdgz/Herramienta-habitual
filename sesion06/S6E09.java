package sesion06;

import java.util.Scanner;

public class S6E09 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int acumulador = 1;
        System.out.println("Dime la base:");
        int base = sc.nextInt();
        System.out.println("Dime el exponente");
        int exponente = sc.nextInt();
        for(int i = 1; i <= exponente; i++){
            acumulador = acumulador * base;
        }
        System.out.println("");
        System.out.println(acumulador);
    }
}
