class Circulo {
    // setNombreAtributo: Asignarle un valor un atributo
    // getNombreAtributo: devuelve el valor del atributo

    private Float radio = 5.0f;
    private String color;
    private String textura;
    public static final Float PI = 3.1416f;

    public Float getRadio() {
        return this.radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public Float getPI() {
        return PI;
    }

    public static float calcularArea(float radio) {
        return PI * (float) Math.pow(radio, 2);
    }

}
