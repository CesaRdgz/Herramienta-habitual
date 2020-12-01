package sesion03;

import java.util.Scanner;

public class S3E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero");
        int num = sc.nextInt();
        boolean menosDiezMasCero = num < 10 && num > 0;
        System.out.println(menosDiezMasCero);

    }
}
