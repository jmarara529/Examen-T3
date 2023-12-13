import java.util.List;
import java.util.Scanner;

public class EjercicioExamen {

    public static void main(String[] args) throws Exception {
        Examen examen =new Examen("T1");

        introducirDatos(examen);

        mostrarDatos(examen);

    }

    private static void mostrarDatos(Examen examen) {
        examen.toString();
        System.out.println("nota redondeada: ");
        examen.redondear();
        System.out.println("está aprobado: ");
        examen.estaAprobado();
    }

    private static void introducirDatos(Examen examen) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce nombre de la asignatura");
        String a = entrada.next();
        Examen.setAsignatura(a);
        System.out.println("introduce la nota de la asignatura;");
        float n = entrada.nextFloat();
        examen.setNota(4.5);
    }

}
