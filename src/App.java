
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("ANA", 20),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("miguel", 40),
            new Persona("laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        ViewConsole viewConsole = new ViewConsole(personas);
        PersonaController pC = new PersonaController(personas);

        viewConsole.printMessage("Arreglo de personas");
        viewConsole.printPersonArray(personas);

        viewConsole.printMessage("\nArreglo ordenado\n");
        pC.ordenarPorEdad(personas);

        viewConsole.printMessage("\nBuscar persona con edad 48\n");
        pC.buscarPorEdad(personas, 40);


        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD



    Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if (personaBuscada == null) {
            viewConsole.printMessage("Nose encontro la persona de la edad 40");
        } else {
            viewConsole.printMessage("Se encontro la persona con la edad 40");
            viewConsole.printMessage(personaBuscada.toString());
        }
        System.out.println(" --------------------------------");
        viewConsole.printMessage("Buscar persona con edad 99");
        Persona personaBuscada2 = pC.buscarPorEdad(personas, 99);
        if (personaBuscada == null) {
            viewConsole.printMessage("Nose encontro la persona con la edad 99");
        } else {
            viewConsole.printMessage("Se encontro la persona con la edad 99");
            viewConsole.printMessage(personaBuscada2.toString());
        }
    }
}
