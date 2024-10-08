
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su peso en KG");
        double peso = sc.nextFloat();
        System.out.println("Duracion del ejercicio (minutos)");
        int min= sc.nextInt();
        System.out.println("Indique el tipo de ejercicio ");
        System.out.println("1-Correr");
        System.out.println("2-Nadar");
        System.out.println("3-Andar en bicicleta");
        int ejercicio= sc.nextInt();

        double caloria_minuto;
        switch (ejercicio) {
            case 1:
                caloria_minuto = 10.0;
                break;
            case 2:
                caloria_minuto = 7.0;
                break;
            case 3:
                caloria_minuto= 8.0;
                break;
            default:   // Se ejecuta si niguno de los casos coincide
                System.out.println("Actividad invalida");
                return;
        }

        double calorias_quemadas= caloria_minuto*peso*min;
        System.out.println("Las calorias quemadas fueron: "+calorias_quemadas);

    }
}
