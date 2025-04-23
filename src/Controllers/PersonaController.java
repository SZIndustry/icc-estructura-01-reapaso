package Controllers;

import Models.Persona;
import views.*;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    private Persona[] people;
    private ViewConsole shoConsole;

    public PersonaController(Persona[] people) {
        this.people = people != null ? people : new Persona[0]; // Aseguramos que people no sea null
        this.shoConsole = new ViewConsole(this.people);
    }

    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserción.
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            int clave = personas[i].getAge();
            int j = i - 1;

            while (j >= 0 && personas[j].getAge() > clave) {
                personas[j + 1] = personas[j];  
                j = j - 1;
            }

            personas[j + 1].setAge(clave);
        }

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getName() + ", Edad: " + persona.getAge());
        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona utilizando la búsqueda binaria.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int izquierda = 0;
        int derecha = personas.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (personas[medio].getAge() == edad) {
                return personas[medio];  
            }

            if (personas[medio].getAge() < edad) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }
}
