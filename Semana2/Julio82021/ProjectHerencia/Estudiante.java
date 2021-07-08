public class Estudiante extends Persona {
    private Integer numeroCarnet;

    public Estudiante(String nombre, Integer edad, Integer documentoid, Integer numeroCarnet) {
        super(nombre, edad, documentoid);
        this.numeroCarnet = numeroCarnet;
    }

    // public Estudiante() {
    // System.out.println("Se ha ejecutado el constructor del hijo Estudiante");
    // }

    @Override
    public void mostrarEdad() {
        System.out.println("La edad del Estudiante es: " + edad);
    }

    public Integer getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(Integer numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

}
