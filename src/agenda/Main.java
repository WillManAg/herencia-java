package agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda miAgenda = new Agenda();
        int opcion;

        do {
            System.out.println("\n--- AGENDA DE CONTACTOS ---");
            System.out.println("1. Alta de contacto");
            System.out.println("2. Baja de contacto (por id)");
            System.out.println("3. Modificar teléfono (por id)");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Empresas por sector (HashMap)");
            System.out.println("6. Ordenar por email (Comparator)");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    altaContacto(teclado, miAgenda);
                    break;
                case 2:
                    System.out.print("Introduce el ID a borrar: ");
                    String idBaja = teclado.nextLine();
                    if (miAgenda.eliminarContacto(idBaja)) {
                        System.out.println("Eliminado con éxito.");
                    } else {
                        System.out.println("No se encontró ese ID.");
                    }
                    break;
                case 3:
                    System.out.print("ID del contacto a modificar: ");
                    String idMod = teclado.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    // Conversión directa en la misma línea
                    int nuevoTel = Integer.parseInt(teclado.nextLine());
                    
                    if (miAgenda.modificarTelefono(idMod, nuevoTel)) {
                        System.out.println("Teléfono actualizado.");
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    miAgenda.listarContactos(); 
                    break;
                case 5:
                    miAgenda.empresasSector();
                    break;
                case 6:
                    miAgenda.listarOrdenadoPorEmail();
                    break;
                case 7:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    public static void altaContacto(Scanner teclado, Agenda agenda) {
        System.out.println("¿Qué tipo de contacto es? (1. Persona / 2. Empresa): ");
        int tipo = Integer.parseInt(teclado.nextLine());

        System.out.print("ID: "); 
        String id = teclado.nextLine();
        
        System.out.print("Teléfono: "); 
        int tel = Integer.parseInt(teclado.nextLine());
        
        System.out.print("Email: "); 
        String email = teclado.nextLine();

        if (tipo == 1) {
            System.out.print("Nombre: "); 
            String nom = teclado.nextLine();
            System.out.print("Apellidos: "); 
            String ape = teclado.nextLine();
            agenda.agregarContacto(new Persona(id, tel, email, nom, ape));
        } else {
            System.out.print("Dirección Postal: "); 
            String dir = teclado.nextLine();
            System.out.print("Sector: "); 
            String sec = teclado.nextLine();
            agenda.agregarContacto(new Empresa(id, tel, email, dir, sec));
        }
    }
}