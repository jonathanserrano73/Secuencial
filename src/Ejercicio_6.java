import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Indique las horas de estudio disponibles: ");
        int horas= sc.nextInt();

        if (horas == 5) {
            System.out.println(
                    "Lunes: \n" +
                            "2 horas: Arquitectura\n"+
                            "2 hora: Programacion \n"+
                            "1 hora: Laboratorio \n"+
                    "Martes: \n"+
                            "2 horas: Laboratorio\n"+
                            "2 hora: Programacion \n"+
                            "1 hora: Matematica \n"+
                    "Miercoles: \n"+
                            "2 horas: Matematica\n"+
                            "2 hora: Programacion \n"+
                            "1 hora: Laboratorio \n"+
                    "Jueves: \n"+
                            "4 horas: Programacion\n"+
                            "1 hora: organizacion \n"+
                    "Viernes: \n"+
                            "2 horas: Organizacion\n"+
                            "2 hora: Programacion \n"+
                            "1 hora: Arquitectura"
                    );


        } else if (horas==4) {
            System.out.println(
                    "Lunes: \n" +
                            "2 horas: Arquitectura\n"+
                            "1 hora: Programacion \n"+
                            "1 hora: Laboratorio \n"+
                    "Martes: \n"+
                            "2 horas: Laboratorio\n"+
                            "1 hora: Programacion \n"+
                            "1 hora: Matematica \n"+
                    "Miercoles: \n"+
                            "2 horas: Matematica\n"+
                            "1 hora: Programacion \n"+
                            "1 hora: Laboratorio \n"+
                    "Jueves: \n"+
                            "3 horas: Programacion\n"+
                            "1 hora: organizacion \n"+
                    "Viernes: \n"+
                            "2 horas: Organizacion\n"+
                            "1 hora: Programacion \n"+
                            "1 hora: Arquitectura"
            );

        } else if (horas==3) {
            System.out.println(
                    "Lunes: \n" +
                            "2 horas: Arquitectura\n"+
                            "1 hora: Programacion \n"+
                    "Martes: \n"+
                            "2 horas: Laboratorio\n"+
                            "1 hora: Programacion \n"+
                    "Miercoles: \n"+
                            "2 horas: Matematica\n"+
                            "1 hora: Programacion \n"+
                    "Jueves: \n"+
                            "2 horas: Programacion\n"+
                            "1 hora: organizacion \n"+
                    "Viernes: \n"+
                            "2 horas: Organizacion\n"+
                            "1 hora: Programacion \n"
            );

        } else {
            System.out.println("Necesitas mas horas de estudio");
        }
    }
}
