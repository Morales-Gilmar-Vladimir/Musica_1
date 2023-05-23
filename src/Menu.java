import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //hola a todos
        Genero rock= new Genero(
                 "Rock",
                "120bpm",
                1950,
                 "EU",
                 "Chuck Berry",
                 "Festival de california");
        Genero rap= new Genero(
                 "Rap",
                 "80bpm",
                 2020,
                 "Venezuela",
                 "MICRO TDH",
                 "Festival de EU");

        int aniotemporal;

        System.out.println("Ingrese el año del genero Rock: ");
        aniotemporal= sc.nextInt();
        rock.setAnio(aniotemporal);
        System.out.println("El nuevo anio de rock es: "+ rock.getAnio());
        rap.setAnio(27020);

        System.out.println(rap.getAnio());
        System.out.println(rock.getAnio());
        System.out.println("\nLa suma de los años juntos es: ");
        System.out.println(rap.getAnio()+ rock.getAnio());

        System.out.println("\nDatos completos del genero: ");
        rock.imprimir_datos();


    }
}
