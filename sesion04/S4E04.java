package sesion04;

import java.util.Scanner;

public class S4E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu numero de unidades");
        int ejercito = sc.nextInt();
        if (ejercito == 0){
            System.out.println("Sin ejercito");
        }else if(ejercito >= 1 && ejercito <= 19){
            System.out.println("Pack");
        }else if(ejercito >= 20 && ejercito <= 249){
            System.out.println("Throng");
        }else if(ejercito >= 250 && ejercito <= 999){
            System.out.println("Zounds");
        }else {
            System.out.println("Legion");
        }
    }
}
