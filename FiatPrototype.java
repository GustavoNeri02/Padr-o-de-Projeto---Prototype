public class FiatPrototype extends CarroPrototype {

    public FiatPrototype(FiatPrototype fiatPrototype) {
        this.modelo = fiatPrototype.getModelo();
        this.cor = fiatPrototype.getCor();
        this.valor = fiatPrototype.getValor();
    }

    public FiatPrototype(){
        this.valor = 0;
    }

    @Override
    public String mostrarInfo() {
        return("Modelo: "+this.modelo +
                "\nCor: "+this.cor+
                "\nValor: "+this.valor+
                "\n");
    }
    @Override
    public FiatPrototype clonar() {
            return new FiatPrototype(this);
    }

    public void ligar(){
        System.out.println(this.modelo+" esta ligado!");
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
