public class Balon {
    String color;
    int tamano;
    //Esto es un constructor con parametros
    public Balon(String color, int tamano){
        this.color = color;
        this.tamano = tamano;
    }
    public void mostrarInformacion(){
        System.out.println("Su Color es: " + color);
        System.out.println("Su Tamaño es de: " + tamano +" m3");
    }
}
