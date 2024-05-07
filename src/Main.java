import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mi primer hola mundo en java");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento= 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        double mediaEvaluacioUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("Incluido en el Plan: " + incluidoEnElPlanBasico);
        System.out.println("Media de evaluacion de la pelicula Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluacio que le darias a la pelicula Matrix:");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacioUsuario = mediaEvaluacioUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix es:" + mediaEvaluacioUsuario /3);

    }
}