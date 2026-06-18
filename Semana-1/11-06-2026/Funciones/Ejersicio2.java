import java.util.Scanner;

public class Ejersicio2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        double imc = 0.0;
        boolean imcCalculado = false;

        System.out.print("Ingrese el nombre del paciente: ");
        nombre = teclado.nextLine();

        while (opcion != 5) {
            System.out.println("\n--- MENÚ DE ACCIONES ---");
            System.out.println("1. Calcular Índice de Masa Corporal (IMC)");
            System.out.println("2. Enviar resultados al correo");
            System.out.println("3. Imprimir reporte");
            System.out.println("4. Pagar consulta / servicio");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese peso en kg (ej. 72.5): ");
                    double peso = teclado.nextDouble();
                    System.out.print("Ingrese altura en metros (ej. 1.70): ");
                    double altura = teclado.nextDouble();
                    
                    imc = calcularIMC(peso, altura);
                    imcCalculado = true;
                    
                    System.out.printf("\n[✓] IMC Calculado: %.2f (%s)\n", imc, obtenerDiagnostico(imc));
                    break;

                case 2:
                    if (!imcCalculado) {
                        System.out.println("Primero debe calcular el IMC (Opción 1).");
                    } else {
                        System.out.print("Ingrese la dirección de correo electrónico: ");
                        String correo = teclado.nextLine();
                        enviarCorreo(correo, nombre, imc);
                    }
                    break;

                case 3:
                    if (!imcCalculado) {
                        System.out.println("Primero debe calcular el IMC (Opción 1).");
                    } else {
                        imprimirReporte(nombre, imc);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el monto a pagar por la consulta: $");
                    double monto = teclado.nextDouble();
                    pagarServicio(monto);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema de salud. ¡Buen día!");
                    break;

                default:
                    System.out.println(" Opción no válida.");
                    break;
            }
        }
        teclado.close();
    }

    // --- FUNCIONES / MÉTODOS DEL PROGRAMA ---

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String obtenerDiagnostico(double imc) {
        if (imc < 18.5) return "Bajo peso";
        if (imc >= 18.5 && imc < 25) return "Peso normal";
        if (imc >= 25 && imc < 30) return "Sobrepeso";
        return "Obesidad";
    }

    public static void enviarCorreo(String correo, String nombre, double imc) {
        System.out.println("[Conectando con el servidor de correo...]");
        System.out.println("Destinatario: " + correo);
        System.out.println("Asunto: Tus Resultados de Salud - " + nombre);
        System.out.printf("Cuerpo: Hola %s, tu IMC registrado es %.2f. Estado: %s.\n", 
            nombre, imc, obtenerDiagnostico(imc));
        System.out.println("Correo enviado exitosamente.");
    }

    public static void imprimirReporte(String nombre, double imc) {
        System.out.println("       REPORTE MÉDICO DE ORDEN DE IMPRESIÓN");

        System.out.println(" Paciente: " + nombre);
        System.out.printf(" Valor IMC:\n", imc);
        System.out.println(" Diagnóstico: " + obtenerDiagnostico(imc));
        System.out.println("Enviado a la cola de impresión de la clínica.");
    }

    public static void pagarServicio(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a pagar debe ser mayor a 0.");
        } else {
            System.out.printf("Pago autorizado con éxito por un valor de:\n", monto);
            System.out.println("¡Gracias por su pago! Su factura ha sido generada.");
        }
    }
}
