package sesion04;

import java.util.Scanner;


public class S4E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce en numero de tazas de mantequilla de cacahuete");
        int numeroMantequilla = sc.nextInt();
        System.out.println("¿Es fin de semana? True/False");
        boolean diaSemana = sc.nextBoolean();
        if (numeroMantequilla >= 10 && numeroMantequilla <= 20 && diaSemana == false){
            System.out.println("¡Sera un exito!");
        } else if (numeroMantequilla >= 15 && numeroMantequilla <= 25 && diaSemana == true) {
            System.out.println("¡Sera un exito!");
        } else {
            System.out.println("Sera un fracaso");
        }
}
}