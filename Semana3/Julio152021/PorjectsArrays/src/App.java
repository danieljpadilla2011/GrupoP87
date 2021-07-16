import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[5];
        vector[0] = 15;
        vector[1] = 20;
        vector[2] = 37;
        vector[3] = 40;
        vector[4] = 5;

        for (int i = 0; i < vector.length; i++) {
            // System.out.println("En la posición " + i + " el valor es: " + vector[i]);
        }

        int[][] matriz = new int[3][4];
        int dato = 15;

        // Llenado de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = dato;
                dato++;
            }
        }
        // recorrido de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // System.out.print(matriz[i][j] + " ");
            }
            // System.out.println();
        }

        // Arrays de objetos
        Carro[] carros = new Carro[2];
        carros[0] = new Carro("Chevrolet");
        carros[1] = new Carro("Jaguar");

        for (int i = 0; i < carros.length; i++) {
            // System.out.println(carros[i]);
        }

        // Listas de objetos
        ArrayList<Carro> carrosLista = new ArrayList<>();
        carrosLista.add(new Carro("Nissan"));
        carrosLista.add(new Carro("Fiat"));

        for (int i = 0; i < carrosLista.size(); i++) {
            // System.out.println(carrosLista.get(i).getMarca());

        }

        Map<Integer, Carro> mapCarros = new HashMap<>();
        mapCarros.put(1, new Carro("Toyota"));
        mapCarros.put(15, new Carro("BMW"));
        System.out.println(mapCarros.size());
        System.out.println(mapCarros.get(15).getMarca());

    }
}
