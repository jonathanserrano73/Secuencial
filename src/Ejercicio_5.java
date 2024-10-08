import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la distancia recorrida en Km: ");
        double distancia= sc.nextDouble();
        System.out.println("Indique el consumo de combustible (l/km): ");
        double consumo = sc.nextDouble();
        System.out.println("Indique el precio del combustible: ");
        double precio= sc.nextDouble();

        double costo_viaje= distancia*consumo*precio;
        System.out.println("El costo toal del viaje fue de: "+costo_viaje);
    }
}
