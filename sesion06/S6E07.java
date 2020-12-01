package sesion06;

import java.util.Scanner;

public class S6E07 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int acumulador = 1;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        for(int i = num; i > 0; i--){
            acumulador = acumulador * i;

        }
        System.out.print(acumulador + " ");
    }
}
