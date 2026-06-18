package EjerciciosColecciones;

import java.time.LocalDate;

public class Suscriptor {
    public String usuario;
    public String contrasena;
    public String fechaInicio;
    public boolean activo;

    public Suscriptor(){
    } 

    public Suscriptor(String usuario, String contrasena, String fechaInicio, boolean activo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }
}
