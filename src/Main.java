//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio #1
        Persona persona = new Persona();
        persona.decirHola();

        //Ejercicio2

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("amarllo","Aveo","HTP-12",45);

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();

        //Ejercicio3

        Balon balon1 = new Balon("Azul", 23);
        Balon balon2 = new Balon("Rojo", 43);
        Balon balon3 = new Balon("Verde", 33);
        balon1.mostrarInformacion();
        balon2.mostrarInformacion();
        balon3.mostrarInformacion();


        //Ejercicio4

        Libro libro1 = new Libro("El codigo Da Vinci","Nostradamus", 219);
        Libro libro2 = new Libro();

        libro1.imprimirInformacion();
        libro2.imprimirInformacion();




    }
}