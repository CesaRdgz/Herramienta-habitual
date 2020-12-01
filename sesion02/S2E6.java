package sesion02;

import java.util.Scanner;

public class S2E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Hora actual");
                int hora = sc.nextInt();
                System.out.println("Minutos actuales");
                int minuto = sc.nextInt();
                System.out.println("Segundos actuales");
                int segundo = sc.nextInt();
                System.out.println("Hora a restar");
                int horaARestar = sc.nextInt();
                System.out.println("Minutos a restar");
                int minutoARestar = sc.nextInt();
                System.out.println("Segundos a restar");
                int segundoARestar = sc.nextInt();

                System.out.println("Segundos de diferencia");
                System.out.println(segundo - segundoARestar);
                System.out.println("Minutos de diferencia");
                System.out.println(minuto - minutoARestar);
                System.out.println("Hora de diferencia");
                System.out.println(hora - horaARestar);
    }
}
