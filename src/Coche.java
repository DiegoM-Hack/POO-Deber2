public class Coche {
    String color;
    String marca;
    String modelo;
    int peso;

    public Coche(String color, String marca, String modelo, int peso) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }

    public Coche(){

    }

    public void mostrarInformacion(){
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Peso: " + peso);
    }

}
