package rpg;

import java.util.ArrayList;
import java.util.Collections;

public class ListaPersonajes {
    private ArrayList<Arquero> personajes; 

    public ListaPersonajes() {
        this.personajes = new ArrayList<>();
    }
    
    public void agregarPersonaje(Arquero personaje) {
        personajes.add(personaje);
    }
    
    public void mostrarPersonajes() {
        for (Arquero a : personajes) {
            System.out.println(a);
        }
    }
    
    public void comparadorRango() {
    	Collections.sort(this.personajes, new ComparadorRango());
    }
    
    public void comparadorSalud() {
    	Collections.sort(this.personajes, new ComparadorSalud());
    }
    
}


