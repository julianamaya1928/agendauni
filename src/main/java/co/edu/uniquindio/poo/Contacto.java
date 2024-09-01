package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String correo;

    public Contacto(){
        
    }
    public Contacto(String nombre, String alias, String direccion, String telefono, String correo){
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
        assert correo.contains("@");

    }


    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "El contacto es:\n - " + nombre + ", " + alias + ", "
                + direccion + ", " + telefono + ", " + correo;
    }
    
    
}
