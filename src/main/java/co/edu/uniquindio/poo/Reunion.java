package co.edu.uniquindio.poo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private String hora;
    private LinkedList<Contacto>contactosAsistentes;

    public Reunion(String descripcion, LocalDate fecha2, String hora){
        this.descripcion=descripcion;
        this.fecha=fecha2;
        this.hora=hora;
        contactosAsistentes=new LinkedList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public LinkedList<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setContactosAsistentes(LinkedList<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }
    
    @Override
    public String toString() {
        return "los contactos que asistiran a la reunion "+descripcion+ " de la fecha "+fecha+" y hora " +hora+" son: \n\n" + contactosAsistentes;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

        //1
        public void agregarContactoReunion (Contacto contacto){
            if (validarNombreReunion(contacto.getNombre())){
                mostrarMensaje("Error, el nombre"+contacto.getNombre()+ "ya existe");
            }else{
                contactosAsistentes.add(contacto);
            }
        }
    
        public boolean validarNombreReunion (String nombre){
            boolean nombreRepetido= false;
            for (Contacto contacto: contactosAsistentes){
                if (contacto.getNombre().equals(nombre)){
                    nombreRepetido=true;
                }
            }
            return nombreRepetido;
        }
    
        public boolean validarTelefonoReunion (String telefono){
            boolean telefonoRepetido= false;
            for (Contacto contacto: contactosAsistentes){
                if (contacto.getTelefono().equals(telefono)){
                    telefonoRepetido=true;
                }
            }
            return telefonoRepetido;
        
    }
    //1
    public void eliminarContactoReunion (String nombre){
        for (Contacto contacto: contactosAsistentes){
            if (contacto.getNombre().equals(nombre)){
                contactosAsistentes.remove(contacto);
                break;
            }
        }
    }
    //1
    public void actualizarContactoReunion (String alias, String direccion, String correo, String nombre){
        for (Contacto contacto: contactosAsistentes){
            if (contacto.getNombre().equals(nombre)){
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                contacto.setCorreo(correo);
                break;
            }
        }
    
    }
    
    
}
