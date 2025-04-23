package views;

import Models.Persona;

public class ViewConsole {
    private Persona[] people;

    public ViewConsole(Persona[] people) {
        this.people = people;
    }

    public void printPersonArray(Persona[] personas) {
        System.out.println("\n--- Listado de Personas ---");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());  
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
