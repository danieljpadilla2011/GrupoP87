public class Sumadora {
    private String programadorName;
    private float valor;

    public Sumadora(String programadorName, float valor) {
        this.programadorName = programadorName;
        this.valor = valor;
    }

    public Sumadora(String programadorName) {
        this.programadorName = programadorName;
    }

    public Sumadora(float valor) {
        this.valor = valor;
    }

    public Sumadora() {
    }

    public String getProgramadorName() {
        return programadorName;
    }

    public void setProgramadorName(String programadorName) {
        this.programadorName = programadorName;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int calcularSuma(int val1, int val2) {
        return val1 + val2;
    }

    public Double calcularSuma(Double val1, Double val2) {
        return val1 + val2;
    }

    public String calcularSuma(String val1, String val2) {
        return val1 + val2;
    }

    public Double calcularSuma(Double val1) {
        return val1 + 5;
    }

}
