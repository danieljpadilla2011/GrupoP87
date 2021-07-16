public class App {
    public static void main(String[] args) throws Exception {
        int div;
        int x;
        int y = 0;
        try {
            x = 56;
            div = x / y;
            System.out.println("La division es: " + div);

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
