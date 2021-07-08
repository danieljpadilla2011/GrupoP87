public class Profesor extends Persona {
    private String materiaEsp;

    public Profesor(String nombre, Integer edad, Integer documentoid, String materiaEsp) {
        super(nombre, edad, documentoid);
        this.materiaEsp = materiaEsp;
    }

    @Override
    public void mostrarEdad() {
        // super.mostrarEdad();
        System.out.println("La edad del profesor es: " + edad);
    }

    public String getMateriaEsp() {
        return materiaEsp;
    }

    public void setMateriaEsp(String materiaEsp) {
        this.materiaEsp = materiaEsp;
    }

}
