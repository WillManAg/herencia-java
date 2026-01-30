package rpg;

public class Tablero {
    public static void main(String[] args) {

        ListaPersonajes misArqueros = new ListaPersonajes();

        misArqueros.agregarPersonaje(new Arquero(333, 20, 10, 50)); 
        misArqueros.agregarPersonaje(new Arquero(444, 25, 5, 80));   
        misArqueros.agregarPersonaje(new Arquero(555, 15, 15, 30)); 

        System.out.println("Ant:");
        misArqueros.mostrarPersonajes();


        misArqueros.comparadorRango();

        System.out.println("Desp Rango:");
        misArqueros.mostrarPersonajes();
        
        misArqueros.comparadorSalud();;
        
        System.out.println("Desp Salud:");
        misArqueros.mostrarPersonajes();
        
    }
}