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
        Contacto contacto5= new Contacto ("Manuel","cesitar", "Barrio Libertadores", "31476895401", "cesar@gmail.com" );
        Contacto contacto7= new Contacto ("Oscar","cesitar", "Barrio Libertadores", "31476895401", "cesar@gmail.com" );

        agenda.CrearContacto(contacto1);
        agenda.CrearContacto(contacto2);
        agenda.CrearContacto(contacto3);
        agenda.CrearContacto(contacto4);
        agenda.CrearContacto(contacto5);
        agenda.CrearContacto(contacto7);
//Grupos
        Grupo  grupo1 =new Grupo("progracion", "Oficina");
        grupo1.agregarContacto(contacto1);
        grupo1.agregarContacto(contacto2);
        grupo1.agregarContacto(contacto3);
        grupo1.agregarContacto(contacto4);
        grupo1.agregarContacto(contacto5);
        agenda.CrearGrupo(grupo1);

        
        String seleccionMenuGenegeral = JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1= Contactos\n 2= Grupos \n 3= Reuniones ");

        if(seleccionMenuGenegeral.equals("1")){
            String seleccionMenuContacto = JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1= AgregarContacto\n 2=Actualizar contacto \n 3=Eliminar contacto \n 4=ingresar contacto ");

        
            if(seleccionMenuContacto.equals("1")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nmbre de contacto");
                String alias = JOptionPane.showInputDialog("Ingresa el alias del contacto ");
                String direccion = JOptionPane.showInputDialog("Ingresa la direccion del contacto");
                String telefono = JOptionPane.showInputDialog("Ingresa el telefono del contacto");
                String correo = JOptionPane.showInputDialog("Ingresa el correo del contacto");
                Contacto contacto6= new Contacto (nombre,alias, direccion, telefono, correo);
                agenda.CrearContacto(contacto6);    
                System.out.println(agenda.listarContactos());
            }
            else if(seleccionMenuContacto.equals("2")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nmbre de contacto");
                String alias = JOptionPane.showInputDialog("Ingresa el alias del contacto ");
                String direccion = JOptionPane.showInputDialog("Ingresa la direccion del contacto");
                String telefono = JOptionPane.showInputDialog("Ingresa el telefono del contacto");
                String correo = JOptionPane.showInputDialog("Ingresa el correo del contacto");
                agenda.actualizarContacto(nombre,alias, direccion, telefono, correo);
                System.out.println(agenda.listarContactos());
            }
            else if(seleccionMenuContacto.equals("3")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nmbre de contacto");
                String telefono = JOptionPane.showInputDialog("Ingresa el telefono del contacto");
                agenda.eliminarContacto(nombre, telefono);
                System.out.println(agenda.listarContactos());
            }
            else if (seleccionMenuContacto.equals("4")) {
                System.out.println(agenda.listarContactos());
            }
            else{
                System.out.println("opcion no valida");
            }
        }
        else if(seleccionMenuGenegeral.equals("2")){
            //Grupo  grupo1 =new Grupo("progracion", "Oficina");
            //grupo1.agregarContacto(contacto1);
            //grupo1.agregarContacto(contacto2);
            //grupo1.agregarContacto(contacto3);
            //grupo1.agregarContacto(contacto4);
            //grupo1.agregarContacto(contacto5);
            //agenda.CrearGrupo(grupo1);
            //agenda.eliminarGrupo(grupo1);
            //grupo1.eliminarContacto("Cesar");
            //agenda.ActualizarGrupo("progracion", "Amigos","Trabajo");

            //System.out.println(agenda.listarGrupos());

            String seleccionMenuGrupo = JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1= Crear grupo\n 2=Actualizar grupo \n 3=Eliminar grupo \n 4=listar grupos e integrantes \n 5=Agregar un contacto a un grupo \n 5=Eliminar un contacto ");

            if(seleccionMenuGrupo.equals("1")) {
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del grupo ");
                String categoria = JOptionPane.showInputDialog("Ingresa la categoria del grupo ");
                Grupo grupo6 = new Grupo(nombre, categoria);

                for (int i = 1; i <= 5; i++) {
                    String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto " + i + ":");

                    while (nombreContacto == null || nombreContacto.trim().isEmpty()) {
                        nombreContacto = JOptionPane.showInputDialog("El nombre del contacto no puede estar vacío. Ingrese el nombre del contacto " + i + ":");
                    }

                    Contacto contactoEncontrado = Agenda.buscarContactoPorNombre(agenda.listarContactos(), nombreContacto);

                    if (contactoEncontrado != null) {
                        grupo6.agregarContacto(contactoEncontrado);
                        System.out.println("Contacto " + nombreContacto + " agregado al grupo.");
                    } else {

                        System.out.println("Error: El contacto con el nombre " + nombreContacto + " no existe en la lista de contactos.");
                        i--;
                    }
                }
                agenda.CrearGrupo(grupo6);
                System.out.println(agenda.listarGrupos());
            }
            //Actualizar grupo
            else if(seleccionMenuGrupo.equals("2")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del grupo a actualizar");
                String nuevonombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre del grupo ");
                String categoria = JOptionPane.showInputDialog("Ingresa la nueva categoria del grupo");
                agenda.ActualizarGrupo(nombre,nuevonombre, categoria);
                System.out.println(agenda.listarGrupos());
            }
            //Eliminar Grupo
            else if(seleccionMenuGrupo.equals("3")){
                String nombre = JOptionPane.showInputDialog("Ingresa el nmmbre del grupo a eliminar ");
                agenda.eliminarGrupo(nombre);
                System.out.println(agenda.listarGrupos());
            }
            //Mostrar grupos
            else if (seleccionMenuGrupo.equals("4")) {
                System.out.println(agenda.listarGrupos());
            }
            //agregar contactos en un grupo
            else if (seleccionMenuGrupo.equals("5")) {
                System.out.println(agenda.listarGrupos());
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del grupo");
                Grupo grupoExistente = agenda.buscarGrupoPorNombre(nombre);
                if (grupoExistente != null){
                    String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto :");
                    Contacto contactoEncontrado = Agenda.buscarContactoPorNombre(agenda.listarContactos(), nombreContacto);
                    grupoExistente.agregarContacto(contactoEncontrado);
                }
                System.out.println(agenda.listarGrupos());
            }
            //eliminar contactos en un grupo
            else if (seleccionMenuGrupo.equals("6")) {
                System.out.println(agenda.listarGrupos());
                String nombre = JOptionPane.showInputDialog("Ingresa el nombre del grupo");
                Grupo grupoExistente = agenda.buscarGrupoPorNombre(nombre);
                if (grupoExistente != null){
                    String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto :");
                    Contacto contactoEncontrado = Agenda.buscarContactoPorNombre(agenda.listarContactos(), nombreContacto);
                    grupoExistente.eliminarContacto(contactoEncontrado.getNombre());
                }
                System.out.println(agenda.listarGrupos());
            }
            else{
                System.out.println("opcion no valida");
            }
        }
                
    }
}
