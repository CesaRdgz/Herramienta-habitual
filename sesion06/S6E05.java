package sesion06;

import java.util.Scanner;

public class S6E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print("Tabla del " + i + " :  ");
            for(int t = 1; t <= 10; t++){
               int r = t * i;
               System.out.print(r + " " + "\t");

            }
            System.out.println("");
        }
    }
}
