import java.util.Scanner;

public class Asignacion_4 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Visitas Semanales a un Edificio");

        // Información del visitante
        System.out.println("Registro de Visitante a Edificio");

        // String para nombre
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        byte edad = scanner.nextByte();

        // Determinar si es mayor o menor de edad
        boolean esMayorDeEdad = edad >= 18;

        // short para piso a visitar
        System.out.print("Ingrese el piso a visitar (ejemplo: 3): ");
        short piso = scanner.nextShort();

        // int para el número de apartamento
        System.out.print("Ingrese el número del apartamento: ");
        int numeroApartamento = scanner.nextInt();

        // long para la cedula
        System.out.print("Ingrese el número de identificación del visitante: ");
        long Cedula = scanner.nextLong();

        // boolean para indicar si el visitante es recurrente
        System.out.print("¿Es un visitante recurrente? (true/false): ");
        boolean esRecurrente = scanner.nextBoolean();

        // char para inicial del apellido
        System.out.print("Ingrese la inicial del apellido del visitante: ");
        char inicialApellido = scanner.next().charAt(0);

        // Registro de visitas semanales
        int totalVisitas = 7; // Asumimos que se registran visitas de lunes a domingo
        int[] tiempoPorVisita = new int[totalVisitas]; // Tiempo de estadía en minutos
        int sumaTiempos = 0;

        System.out.println("\nRegistro de visitas durante la semana:");
        for (int i = 0; i < totalVisitas; i++) {
            System.out.print("Ingrese el tiempo de estadía en minutos para el día " + (i + 1) + ": ");
            tiempoPorVisita[i] = scanner.nextInt();
            sumaTiempos += tiempoPorVisita[i];
        }

        // Cálculo del tiempo promedio de estadía
        float tiempoPromedio = (float) sumaTiempos / totalVisitas;

        // Cerrar el objeto Scanner
        scanner.close();

        // Mostrar la información del visitante
        System.out.println("\n--- Información del Visitante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años (" + (esMayorDeEdad ? "Mayor de edad" : "Menor de edad") + ")");
        System.out.println("Piso a visitar: " + piso);
        System.out.println("Número de apartamento: " + numeroApartamento);
        System.out.println("Número de identificación: " + Cedula);
        System.out.println("Visitante recurrente: " + esRecurrente);
        System.out.println("Inicial del apellido: " + inicialApellido);
        System.out.println("Número total de visitas durante la semana: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");

    }
}