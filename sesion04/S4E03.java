package sesion04;

import java.util.Scanner;

public class S4E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int diaSemana = sc.nextInt();
        if (diaSemana == 1){
            System.out.println("Lunes");
        }else if(diaSemana == 2){
            System.out.println("Martes");
        }else if(diaSemana == 3){
            System.out.println("Miercoles");
        }else if(diaSemana == 4){
            System.out.println("Jueves");
        }else if(diaSemana == 5){
            System.out.println("Viernes");
        }else if(diaSemana == 6){
            System.out.println("Sabado");
        }else if(diaSemana == 7){
            System.out.println("Domingo");
        }else{
            System.out.println("No equivale a ningun dia de la semana");
        }

    }
}
