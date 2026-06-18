import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n--- MENÚ DEL ASISTENTE ---");
            System.out.println("1. Configurar Alarma");
            System.out.println("2. Escoger Música");
            System.out.println("3. Agendar Cita");
            System.out.println("4. Realizar Llamada");
            System.out.println("5. Cancelar Acciones");
            System.out.println("6. Apagar Asistente");
            System.out.print("Seleccione un servicio: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la hora de la alarma (ej. 07:30): ");
                    String hora = teclado.nextLine();
                    configurarAlarma(hora);
                    break;

                case 2:
                    System.out.println("Géneros disponibles: 1. Rock | 2. Pop | 3. Jazz");
                    System.out.print("Seleccione el número del género: ");
                    int genero = teclado.nextInt();
                    escogerMusica(genero);
                    break;

                case 3:
                    System.out.print("¿Qué asunto o evento desea registrar?: ");
                    String asunto = teclado.nextLine();
                    System.out.print("Ingrese la fecha de la cita (ej. 20-Junio): ");
                    String fecha = teclado.nextLine();
                    agendarCita(asunto, fecha);
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del contacto o número: ");
                    String contacto = teclado.nextLine();
                    llamarContacto(contacto);
                    break;

                case 5:
                    System.out.println("Operaciones recientes: [Alarma] [Música] [Cita] [Llamada]");
                    System.out.print("Escriba qué acción desea revocar/cancelar: ");
                    String accion = teclado.nextLine();
                    cancelarAccion(accion);
                    break;

                case 6:
                    System.out.println("Apagando asistente virtual. ¡Que tenga un excelente día!");
                    break;

                default:
                    System.out.println("Opción no válida del sistema.");
                    break;
            }
        }
        teclado.close();
    }

    // --- MÉTODOS Y FUNCIONES DEL ASISTENTE ---

    public static void configurarAlarma(String horaAlarma) {
        System.out.println("\n[Configurando reloj interno...]");
        System.out.println("Alarma establecida con éxito a las: " + horaAlarma);
    }

    public static void escogerMusica(int tipoGenero) {
        System.out.println("\n[Conectando con el servicio de Streaming...]");
        switch (tipoGenero) {
            case 1:
                System.out.println("Reproduciendo: 'Lista de éxitos de Rock Clásico'");
                break;
            case 2:
                System.out.println("Reproduciendo: 'Pop Internacional del Momento'");
                break;
            case 3:
                System.out.println("Reproduciendo: 'Jazz Instrumental Relajante'");
                break;
            default:
                System.out.println("Género musical no disponible.");
                break;
        }
    }

    // Función 3: Almacena los strings de un registro de agenda
    public static void agendarCita(String descripcion, String fechaCita) {
        System.out.println("[Sincronizando con tu Calendario Personal...]");
        System.out.println("Cita guardada correctamente:");
        System.out.println("    Evento: " + descripcion + " | Fecha: " + fechaCita);
    }

    // Función 4: Enlaza una llamada telefónica simulada
    public static void llamarContacto(String nombreContacto) {
        System.out.println("[Marcando red móvil exterior...]");
        System.out.println("lamando a: " + nombreContacto + "...");
        System.out.println("Conexión establecida. En línea.");
    }

    public static void cancelarAccion(String tipoAccion) {
        String accionLimpia = tipoAccion.trim().toLowerCase();
        System.out.println("[Accediendo al registro de procesos activos...]");
        
        if (accionLimpia.equals("alarma") || accionLimpia.equals("musica") || 
            accionLimpia.equals("cita") || accionLimpia.equals("llamada")) {
            System.out.println("La acción de '" + tipoAccion + "' ha sido cancelada y removida de la memoria.");
        } else {
            System.out.println("No se encontró ninguna acción activa bajo el nombre: " + tipoAccion);
        }
    }
}
