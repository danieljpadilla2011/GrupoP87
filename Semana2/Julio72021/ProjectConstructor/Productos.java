class Productos {
    private Double precio;
    private Double iva;

    public Productos(Double precio, Double iva) {
        this.precio = precio;
        this.iva = iva;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double calcularValorCompra(int cantidad) {
        return (this.precio + (this.precio * this.iva)) * cantidad;

    }

}
