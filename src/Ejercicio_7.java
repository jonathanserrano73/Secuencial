import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nivel de satisfaccion con la vida (1-10)");
        int satisfaccion = sc.nextInt();

        System.out.println("Nivel de estres (1-10) ");
        int estres = sc.nextInt();

        System.out.println("Nivel de Salud (1-10) ");
        int salud = sc.nextInt();

        System.out.println("Nivel de felicidad en general (1-10");
        int felicidad = sc.nextInt();

        double indice = (satisfaccion + (10 - estres) + salud + felicidad) / 4;

        System.out.println("Tu indice de felicidad es: ");
        if (indice >= 8) {
            System.out.println("Tienes un exclente indice de felicidad");
        }
        else if (indice>=5){
            System.out.println("Tienes un buen indice de felicidad, pero puedes mejorar");
        }
        else {
            System.out.println("Debes trabajar en tu indice de felicidad");
        }
    }
}
