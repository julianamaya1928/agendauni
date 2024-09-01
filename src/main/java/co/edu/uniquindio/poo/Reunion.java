package co.edu.uniquindio.poo;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private LinkedList<Contacto>contactosAsistentes;

    public Reunion(String descripcion, Date fecha, Time hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        contactosAsistentes=new LinkedList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public LinkedList<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setContactosAsistentes(LinkedList<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }
    
    @Override
    public String toString() {
        return "los contactos que asistiran a la reunion son: \n\n" + contactosAsistentes;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
}
