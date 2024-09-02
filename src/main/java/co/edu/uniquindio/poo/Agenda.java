package co.edu.uniquindio.poo;

import java.util.LinkedList;


public class Agenda {
    
    private LinkedList<Contacto> contactos;
    private LinkedList<Grupo> grupos;

    public Agenda(){
        contactos= new LinkedList<>();
        grupos=  new LinkedList<>();
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

    //GRUPOS
    public boolean validarGrupo (String nombre){
        boolean nombreRepetidoGrupo = false;
        for (Grupo grupo: grupos){
            if (grupo.getNombre().equals(nombre)){ 
                nombreRepetidoGrupo = true;
            }
        }
        return nombreRepetidoGrupo;
    }
    
    public void CrearGrupo(Grupo grupo){
        boolean grupoRepetido = validarGrupo(grupo.getNombre());
        if(grupoRepetido){
            System.out.println("Grupo Existente");
        }
        else if (grupo.getContactos().size() < 5) {
            System.out.println("El grupo debe contener al menos 5 contactos");
        } 
        else{
            grupos.add(grupo);
            System.out.println("Grupo creado");
        }
        
    }
    public LinkedList<Grupo> listarGrupos(){
        return grupos;
    }
    public void eliminarGrupo(String nombre){
        boolean grupoexiste = validarGrupo(nombre);
        if (grupoexiste) {
            for(Grupo grupo: grupos){
                if(grupo.getNombre().equals(nombre) ){
                    grupos.remove(grupo);
                }
            }
            System.out.println("Grupo eliminado"); 
        }
        else{
            System.out.println("grupo no encontrado"); 
        }
    }

    
    public void ActualizarGrupo(String nombre, String categoria, String nuevoNombre){
        boolean grupoexiste = validarGrupo(nombre);
        if (grupoexiste) {
            for(Grupo grupo: grupos){
                if(grupo.getNombre().equals(nombre) ){
                    grupo.setNombre(nuevoNombre);
                    grupo.setCategoria(categoria);
                }
            }
            System.out.println("Grupo actualizado"); 
        }
        else{
            System.out.println("grupo no actualizado"); 
        }
    }

    public static Contacto buscarContactoPorNombre(LinkedList<Contacto> listaContactos, String nombre) {
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto; // Contacto encontrado
            }
        }
        return null; // Contacto no encontrado
    }

    public Grupo buscarGrupoPorNombre(String nombreGrupo) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equalsIgnoreCase(nombreGrupo)) {
                return grupo;
            }
        }
        return null;
    }

}
