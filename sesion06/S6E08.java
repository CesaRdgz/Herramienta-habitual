package sesion06;

import java.util.Scanner;

public class S6E08 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++){
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
