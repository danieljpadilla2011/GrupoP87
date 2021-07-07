public class Main {
    public static void main(String[] args) {
        Productos producto1 = new Productos(2500.0, 0.21);
        System.out.println("El precio inicial es: " + producto1.getPrecio());
        System.out.println("El iva inicial es: " + producto1.getIva());
        double valorCompra = producto1.calcularValorCompra(15);
        System.out.println("El valor de compra es: " + valorCompra);

    }
}
