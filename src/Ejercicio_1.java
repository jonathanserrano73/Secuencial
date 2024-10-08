import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Pedir que se ingrese la fecha
        System.out.println("Ingresa tu fecha de nacimiento DD/MM/AAAA:");
        String fecha_nac= sc.nextLine();
        //Separar la fecha
        String[] fecha =fecha_nac.split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int anio = Integer.parseInt(fecha[2]);

        String signo = "";
        String horoscopo = "";
        
        if ((mes == 1 && dia >=20) || (mes==2 && dia <= 18)){
            signo="Acuario";
            horoscopo = "Tu originalidad te hará destacar. ¡No tengas miedo de ser diferente y expresar tu individualidad! ";
        } else if ((mes ==2 && dia>=19) || (mes==3 && dia<=20)) {
            signo="Piscis";
            horoscopo="La intuición te guiará en tus sueños. ¡Conéctate con tu mundo interior y deja volar tu imaginación! ";
        } else if ((mes==3 && dia >= 21) || (mes==4 && dia<=19)) {
            signo= "Aries";
            horoscopo ="Tu energía ardiente te llevará a conquistar nuevos desafíos. ¡No tengas miedo de tomar la iniciativa! ";
        }else if ((mes == 4 && dia >=20 ) || (mes == 5 && dia <=20)){
            signo="Tauro";
            horoscopo = "La estabilidad es tu norte. Disfruta de los pequeños placeres y fortalece tus relaciones más cercanas ";
        }else if ((mes == 5 && dia >=21) || (mes == 6 && dia <=20)){
            signo="Geminis";
            horoscopo= "Tu mente curiosa te llevará a explorar nuevos horizontes. ¡Prepárate para aprender y comunicarte con todos!";
        } else if ((mes == 6 && dia >=21) || (mes==7 && dia<=22)) {
            signo= "Cancer";
            horoscopo="La intuición te guiará en tus decisiones. Conéctate con tus emociones y busca la compañía de tus seres queridos. ";
        }else if ((mes == 7 && dia>=23) || (mes == 8 && dia <=22)){
            signo= "Leo";
            horoscopo="Tu carisma brillará con más fuerza que nunca. ¡Es el momento de brillar y demostrar tu talento! ";
        }else if ((mes == 8 && dia>=23) || (mes == 9 && dia <=22)){
            signo= "Virgo";
            horoscopo="La organización será tu aliada. Planifica tus tareas y disfruta de los resultados de tu esfuerzo. ";
        } else if ((mes == 9 && dia>=23) || (mes==10 && dia<=22)) {
            signo="Libra";
            horoscopo="La armonía será tu objetivo. Busca el equilibrio en todas las áreas de tu vida y cultiva relaciones positivas. ";
        } else if ((mes== 10 && dia >=23) || (mes ==11 && dia<=21)) {
            signo="Escorpio";
            horoscopo="Tu intensidad te llevará a profundizar en tus relaciones. ¡No tengas miedo de expresar tus emociones! ";
        } else if ((mes == 11 && dia>=22) || (mes==12 && dia<=21)) {
            signo="Sagitario";
            horoscopo="La aventura te llama. ¡Explora nuevos lugares y amplía tus conocimientos! ";
        }else if ((mes == 12 && dia>=22) || (mes == 1 && dia<=19)) {
            signo="Capricornio";
            horoscopo="La disciplina te llevará al éxito. ¡Persigue tus metas con determinación y paciencia! ";
        } else {
            System.out.println("Fecha invalida");
            return;  // termina el programa si la fecha es invalida

        }
        System.out.println("Tu signo del zodiaco es: "+signo);
        System.out.println("Tu horosco es: "+horoscopo);
    }

}
