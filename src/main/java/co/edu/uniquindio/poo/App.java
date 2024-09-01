package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       
        //crear contacto
        Agenda agenda = new Agenda();
        Contacto contacto1= new Contacto ("Alejandro","El Socio", "Conjunto la Loma", "3209003000", "alejo@gmail.com" );

        Contacto contacto2= new Contacto ("Camilo","El Rey", "Barrio Granada", "3147654039", "cami@gmail.com" );

        Contacto contacto3= new Contacto ("Felipe","Fell", "Nueva Cecilia", "3146573902", "fell@gmail.com" );

        Contacto contacto4= new Contacto ("Cesar","cesitar", "Barrio Libertadores", "3147689540", "cesar@gmail.com" );
        agenda.CrearContacto(contacto1);
        agenda.CrearContacto(contacto2);
        agenda.CrearContacto(contacto3);  
        agenda.CrearContacto(contacto4); 
        
        String seleccionMenu = JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1= AgregarContacto\n 2=Actualizar contacto \n 3=Eliminar contacto \n 4=ingresar contacto ");

        String nombre = JOptionPane.showInputDialog("Ingresa el nmbre de contacto");
        String alias = JOptionPane.showInputDialog("Ingresa el alias del contacto ");
        String direccion = JOptionPane.showInputDialog("Ingresa la direccion del contacto");
        String telefono = JOptionPane.showInputDialog("Ingresa el telefono del contacto");
        String correo = JOptionPane.showInputDialog("Ingresa el correo del contacto");

       
        if(seleccionMenu.equals("1")){
            Contacto contacto5= new Contacto (nombre,alias, direccion, telefono, correo);
            agenda.CrearContacto(contacto5);    
            System.out.println(agenda.listarContactos());
        }
        else if(seleccionMenu.equals("2")){
            agenda.actualizarContacto(nombre,alias, direccion, telefono, correo);
            System.out.println(agenda.listarContactos());
        }
        else if(seleccionMenu.equals("3")){
            agenda.eliminarContacto(nombre, telefono);
            System.out.println(agenda.listarContactos());
        }
        else if (seleccionMenu.equals("4")) {
            System.out.println(agenda.listarContactos());
        }
        else{
            System.out.println("opcion no valida");
        }
    }
}
