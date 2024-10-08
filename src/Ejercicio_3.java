import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Ingresa el nivel de condicion fisica
        System.out.println("Indique su nivel de condición");
        System.out.println("1-Principiante");
        System.out.println("2-Intermedio");
        System.out.println("3-Avanzado");
        int nivel= sc.nextInt();
        //Lee el nivel y muestra la rutina semanal
        switch (nivel){
            case 1:
                System.out.println(
                        "Rutina Semanal de Ejercicios Nivel Principiante (30 minutos por sesión)\n"+
                                "Lunes: Fuerza Superior\n" +
                                "  - Flexiones: 3 series al fallo.\n" +
                                "  - Press de hombros con mancuernas: 3 series de 12 repeticiones.\n" +
                                "  - Fondos en silla: 3 series de 15 repeticiones.\n\n" +

                                "Martes: Cardio\n" +
                                "  - Elige tu actividad favorita: correr, bicicleta, nadar, etc.\n" +
                                "  - Duración: 30 minutos.\n\n" +

                                "Miércoles: Descanso o actividad ligera\n" +
                                "  - Yoga, pilates o estiramientos suaves.\n\n" +

                                "Jueves: Fuerza Inferior\n" +
                                "  - Sentadillas: 3 series de 15 repeticiones.\n" +
                                "  - Lunges (zancadas): 3 series de 10 repeticiones por pierna.\n" +
                                "  - Elevación de talones: 3 series de 15 repeticiones.\n\n" +

                                "Viernes: Cuerpo Completo\n" +
                                "  - Burpees: 3 series de 10 repeticiones.\n" +
                                "  - Plancha frontal: 3 series de 30 segundos.\n" +
                                "  - Saltar la cuerda: 3 series de 1 minuto."
                );
                break;
            case 2:
                System.out.println(
                        "Rutina Semanal de Entrenamiento (Nivel Intermedio)\n" +
                                "Duración: 45-60 minutos por sesión.\n\n" +
                                "Lunes: Fuerza Superior\n" +
                                "  - Press de banca inclinado: 4 series de 8-12 repeticiones.\n" +
                                "  - Remo con barra: 4 series de 8-12 repeticiones.\n" +
                                "  - Elevaciones laterales: 4 series de 12-15 repeticiones.\n" +
                                "  - Fondos en paralelas: 4 series al fallo.\n\n" +
                                "Martes: Cardio de alta intensidad (HIIT)\n" +
                                "  - 20-30 minutos de intervalos de alta intensidad. Ej: 30 segundos de ejercicio intenso (sprints, burpees), 30 segundos de descanso. Repetir por 8-12 rondas.\n\n" +
                                "Miércoles: Descanso o actividad ligera\n" +
                                "  - Yoga, pilates o estiramientos suaves.\n\n" +
                                "Jueves: Fuerza Inferior\n" +
                                "  - Sentadillas profundas: 4 series de 8-12 repeticiones.\n" +
                                "  - Peso muerto rumano: 4 series de 10-12 repeticiones.\n" +
                                "  - Zancadas búlgaras: 3 series de 10-12 repeticiones por pierna.\n" +
                                "  - Elevación de pantorrillas: 4 series de 15-20 repeticiones.\n\n" +
                                "Viernes: Cuerpo Completo\n" +
                                "  - Clean and press: 4 series de 6-8 repeticiones.\n" +
                                "  - Dominadas: Máximo de repeticiones en 3 series."
                );
                break;
            case 3:
                System.out.println(
                        "Rutina Semanal de Entrenamiento (Nivel Avanzado)\n" +
                                "Duración: 60-90 minutos por sesión.\n\n" +
                                "Lunes: Fuerza Superior (Pecho, Hombros, Tríceps)\n" +
                                "  - Press de banca inclinado: 5 series de 5-8 repeticiones.\n" +
                                "  - Remo con barra: 5 series de 8-12 repeticiones.\n" +
                                "  - Press militar: 5 series de 6-8 repeticiones.\n" +
                                "  - Fondos en paralelas con carga: 4 series al fallo.\n" +
                                "  - Crucifijos con mancuernas: 3 series de 12-15 repeticiones.\n\n" +
                                "Martes: Fuerza Inferior (Piernas, Glúteos)\n" +
                                "  - Sentadilla profunda con barra: 5 series de 5-8 repeticiones.\n" +
                                "  - Peso muerto convencional: 5 series de 3-5 repeticiones.\n" +
                                "  - Zancadas búlgaras con mancuerna: 3 series de 10-12 repeticiones por pierna.\n" +
                                "  - Hip thrust con barra: 4 series de 12-15 repeticiones.\n" +
                                "  - Elevación de pantorrillas en máquina: 4 series de 15-20 repeticiones.\n\n" +
                                "Miércoles: Descanso o actividad ligera\n" +
                                "  - Yoga, pilates o estiramientos suaves.\n\n" +
                                "Jueves: Fuerza Superior (Espalda, Bíceps)\n" +
                                "  - Dominadas con lastre: 4 series al fallo.\n" +
                                "  - Remo pendlay: 4 series de 8-12 repeticiones.\n" +
                                "  - Jalón al mentón con agarre ancho: 3 series de 12-15 repeticiones.\n" +
                                "  - Curl de bíceps con barra: 3 series de 10-12 repeticiones.\n" +
                                "  - Curl de bíceps con mancuernas martillo: 3 series de 12-15 repeticiones.\n\n" +
                                "Viernes: Entrenamiento de Alta Intensidad (HIIT)\n" +
                                "  - 30 minutos de intervalos de alta intensidad (ej: 30 segundos de ejercicio intenso, 30 segundos de descanso).\n" +
                                "  - Opciones: sprints, burpees, saltar la cuerda, sentadillas, flexiones."
                );
                break;
            default:
                System.out.println("Indique un nivel valido");
                return;


        }
    }
}
