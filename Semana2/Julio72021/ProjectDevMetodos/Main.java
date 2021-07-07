public class Main {
    public static void main(String[] args) {
        Circulo circ1 = new Circulo();
        System.out.println("El radio es: " + circ1.getRadio());
        System.out.println("El area es: " + circ1.calcularArea());
        circ1.setRadio(7.5f);
        System.out.println("El radio es: " + circ1.getRadio());
        System.out.println("El area es: " + circ1.calcularArea());

    }

}
