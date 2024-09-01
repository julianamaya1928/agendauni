package co.edu.uniquindio.poo;

import java.util.LinkedList;


public class Agenda {
    
    private LinkedList<Contacto> contactos;

    public Agenda(){
        contactos= new LinkedList<>();
    }

    public void CrearContacto(Contacto contacto){
        boolean datosRepetidos = validarContacto(contacto.getNombre(), contacto.getTelefono());
        if (datosRepetidos){
            System.out.println("contacto ya existente");
        }
        else{
            contactos.add(contacto);
            System.out.println("contacto creado");
        }
    }

    public boolean validarContacto (String nombre, String telefono){
        boolean datosRepetidos = false;
        for (Contacto contacto: contactos){
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){ 
                datosRepetidos = true;
            }
        }
        return datosRepetidos;
    }

    public void actualizarContacto(String nombre, String alias, String direccion, String telefono, String correo){
        boolean contactoxiste = validarContacto(nombre, telefono);
        if (contactoxiste) {
            for(Contacto contacto: contactos){
                if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                    contacto.setAlias(alias);
                    contacto.setCorreo(correo);
                    contacto.setDireccion(direccion);
                }
            }
            System.out.println("contacto Actualiza");
        } 
        else{
            System.out.println("contacto no encontrado");       
        }       
    }

    public void eliminarContacto(String nombre, String telefono){
        boolean contactoxiste = validarContacto(nombre, telefono);
        if (contactoxiste) {
            for(Contacto contacto: contactos){
                if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                    contactos.remove(contacto);
                }
            }
            System.out.println("contacto eliminado"); 
        }
        else{
            System.out.println("contacto no encontrado"); 
        }
    }

    public LinkedList<Contacto> listarContactos(){
        return contactos;
    }
}
