package sesion03;

import java.util.Scanner;

public class S3E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int num3 = sc.nextInt();
        int suma = (num1 + num2 + num3);
        boolean igualVeinte = suma == 20;
        System.out.println(igualVeinte);
    }
}
