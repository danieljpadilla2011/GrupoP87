public class Main {
    public static void main(String[] args) {
        // Estudiante estudiante = new Estudiante();

        Estudiante estudiante = new Estudiante("Luisa", 25, 12345, 2088);
        System.out.println("El nombre del estudiante es: " + estudiante.getNombre());
        System.out.println("El carnet es: " + estudiante.getNumeroCarnet());
        estudiante.mostrarEdad();

        Profesor profesor1 = new Profesor("Milena", 35, 2275, "Derecho");
        System.out.println("El nombre de la profesora es: " + profesor1.getNombre());
        System.out.println("Materia de especialización: " + profesor1.getMateriaEsp());
        profesor1.mostrarEdad();

    }

}
