package sesion04;

import java.util.Scanner;

public class S4E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu sueldo");
        int sueldo = sc.nextInt();
        if (sueldo <= 9000){
            System.out.println("No debe pagar impuestos");
        }else{
            System.out.println("Debe pagar impuestos");
        }
    }
}
