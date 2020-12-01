package sesion06;

import java.util.Scanner;

public class S6E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        System.out.println("Num 1");
        int num1 = sc.nextInt();
        System.out.println("Num 2");
        int num2 = sc.nextInt();
        if (num1 < num2){
            for(int i = num1; i < num2; i++){
                acumulador = acumulador + i;
                System.out.print(acumulador + " ");
            }
        } else {
            for(int i = num2; i < num1; i++){
                acumulador = acumulador + i;
                System.out.print(acumulador + " ");
            }
        }
    }
}