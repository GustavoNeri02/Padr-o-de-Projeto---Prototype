public abstract class CarroPrototype {
    protected String cor;
    protected double valor;
    protected String modelo;



    public abstract String mostrarInfo();
    public abstract CarroPrototype clonar();


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
