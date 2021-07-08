public class Persona {
    protected String nombre;
    protected Integer edad;
    protected Integer documentoid;

    public Persona(String nombre, Integer edad, Integer documentoid) {
        this.nombre = nombre;
        this.edad = edad;
        this.documentoid = documentoid;
    }

    // public Persona() {
    // System.out.println("Se ha ejecutado el constructor del Padre Persona");

    // }

    public void mostrarEdad() {
        System.out.println("La edad es: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumentoid() {
        return documentoid;
    }

    public void setDocumentoid(Integer documentoid) {
        this.documentoid = documentoid;
    }

}
