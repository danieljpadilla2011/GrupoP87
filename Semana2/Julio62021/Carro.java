public class Carro {
    String color;
    String marca;
    Integer modelo; 
    
    public void establecerAtributos(String color, String marca, Integer modelo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
    }

    public void acelerar(){
        System.out.println("El carro está acelerando");
    }

    public void frenar(){
        System.out.println("El carro está frenando");
    }
    
}
