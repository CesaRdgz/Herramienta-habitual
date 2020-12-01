package sesion03;

import java.util.Scanner;

public class S3E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int num3 = sc.nextInt();
        boolean noIgual = num1 != num2 && num1 != num3 && num2 != num3;
        System.out.println(noIgual);
    }
}
