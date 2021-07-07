public class Main {
    public static void main(String[] args) {
        Sumadora sumadora1 = new Sumadora("Pedro", 2800.2f);
        Sumadora sumadora2 = new Sumadora("Juan");
        Sumadora sumadora3 = new Sumadora(3780.3f);
        Sumadora sumadora4 = new Sumadora();

        System.out.println("Sumadora 1: " + sumadora1.getProgramadorName() + " " + sumadora1.getValor());
        System.out.println("Sumadora 2: " + sumadora2.getProgramadorName() + " " + sumadora2.getValor());
        System.out.println("Sumadora 3: " + sumadora3.getProgramadorName() + " " + sumadora3.getValor());
        System.out.println("Sumadora 4: " + sumadora4.getProgramadorName() + " " + sumadora4.getValor());

        // var res = sumadora1.calcularSuma(2.0);
        // System.out.println("La suma es: " + res);

    }

}
