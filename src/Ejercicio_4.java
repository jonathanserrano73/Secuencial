import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Indique el estado de animo");
        System.out.println("1-Feliz");
        System.out.println("2-Triste");
        System.out.println("3-Energico");
        System.out.println("4-Relajado");
        int estado= sc.nextInt();
        switch (estado) {
            case 1:
                System.out.println(
                        "Lista de reproduccion para el estado de animo Feliz\n"+
                        "1- Happy - Pharrell Williams\n"+
                        "2- Queen - Don't Stop Me Now\n"+
                        "3- Eye Of The Tiger – Survivor "
                        );
                break;
            case 2:
                System.out.println(
                        "Lista de reproduccion para el estado de animo Triste\n"+
                        "1- Everybody Hurts – REM\n"+
                        "2- Hallelujah – Leonard Cohen\n "+
                        "3- Fix You' – Coldplay"
                );
                break;
            case 3:
                System.out.println(
                        "Lista de reproduccion para el estado de animo Energico\n"+
                         "1- Can't Stop the Feeling! - Justin Timberlake\n"+
                         "2- Uptown Funk - Mark Ronson ft. Bruno Mars\n"+
                         "3- Eye of the Tiger - Survivor"
                );
                break;
            case 4:
                System.out.println(
                        "Lista de reproduccion para el estado de animo Relajado\n"+
                        "1- Weightless - Marconi Union\n"+
                        "2- Enya - Watermark\n"+
                        "3- Sunflower - Post Malone & Swae Lee"
                );
                break;
            default:
                System.out.println("Indique un estado de animo de la lista");
        }
    }
}
