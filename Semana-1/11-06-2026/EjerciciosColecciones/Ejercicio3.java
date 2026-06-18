package EjerciciosColecciones;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String contraseña ;

        Suscriptor sub1 = new Suscriptor();
        sub1.usuario="bryant";
        sub1.contrasena="123456";
        sub1.fechaInicio="18-06-2026";
        sub1.activo= true;
        Suscriptor sub2 = new Suscriptor();
        sub2.usuario="alfredo";
        sub2.contrasena="123456";
        sub2.fechaInicio="18-05-2026";
        sub2.activo= false;

        System.out.println("Ingresa el nombre de usario y su contraseña");
        System.out.println("Ingresa el nombre de usario ");
        usuario= entrada.nextLine();
        System.out.println("Ingresa la contraseña");
        contraseña = entrada.nextLine();

        validar_suscripcion(usuario,contraseña,sub1,sub2);

    }

    public static void validar_suscripcion(String usuario, String contraseña,  Suscriptor...  suscriptores) {

        System.out.println(suscriptores[0].usuario + " -- "+  suscriptores[1].usuario);
        
        for(Suscriptor suscripcion: suscriptores){

            if(usuario.equals(suscripcion.usuario) && contraseña.equals(suscripcion.contrasena)){
                System.out.println("Estado de la suscripcion: ");
                    if (suscripcion.activo) {
                        System.out.println("Activo ");
                    } else {
                        System.out.println("Inactiva ");
                    }
                break;
            } else {
                System.out.println("Usuario contraseña incorrecta");
                break;
            }
        }
    }
}
