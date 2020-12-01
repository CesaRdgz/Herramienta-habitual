package sesion04;

import java.util.Scanner;

public class S4E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
