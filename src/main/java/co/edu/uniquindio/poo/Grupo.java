package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private String categoria;
    private LinkedList <Contacto> contactos;

    private Grupo(String nombre, String categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        contactos=new LinkedList<>();
    }
    private enum categoria{
        oficina,
        fiesta,
        amigos,
        familia,
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public LinkedList<Contacto> getContactos() {
        return contactos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "El nombre de la categoria del grupo es: " + categoria + "y los contactos que pertenecen al grupo son: \n\n" + contactos;
    }


    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    public void agregarContacto (Contacto contacto){
        if (validarNombre(contacto.getNombre())){
            mostrarMensaje("Error, el nombre"+contacto.getNombre()+ "ya existe");
        }else{
            contactos.add(contacto);
        }
    }

    public boolean validarNombre (String nombre){
        boolean nombreRepetido= false;
        for (Contacto contacto: contactos){
            if (contacto.getNombre().equals(nombre)){
                nombreRepetido=true;
            }
        }
        return nombreRepetido;
    }

    public boolean validarTelefono (String telefono){
        boolean telefonoRepetido= false;
        for (Contacto contacto: contactos){
            if (contacto.getTelefono().equals(telefono)){
                telefonoRepetido=true;
            }
        }
        return telefonoRepetido;
    
}

public void eliminarContacto (String nombre){
    for (Contacto contacto: contactos){
        if (contacto.getNombre().equals(nombre)){
            contactos.remove(contacto);
            break;
        }
    }
}

public void actualizarContacto (String alias, String direccion, String correo, String nombre){
    for (Contacto contacto: contactos){
        if (contacto.getNombre().equals(nombre)){
            contacto.setAlias(alias);
            contacto.setDireccion(direccion);
            contacto.setCorreo(correo);
            break;
        }
    }

}
}
