public class Cuadrado extends FiguraGeometrica {
    private float lado;

    public Cuadrado(int numeroLados, float lado) {
        super(numeroLados);
        this.lado = lado;
    }

    @Override
    public float area() {
        return (lado * lado);
    }

    @Override
    public float perimetro() {
        return (4 * lado);
    }

}
