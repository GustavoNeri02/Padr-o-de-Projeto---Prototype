public class main {
    public static void main(String[] args){

    FiatPrototype uno2013 = new FiatPrototype();
    uno2013.setModelo("Way");
    uno2013.setCor("Vermelho");
    uno2013.setValor(20000);

    FiatPrototype uno2021 = uno2013.clonar();
    //uno2021.setValor(55000);
    //uno2021.setCor("Branco");
    //uno2021.setModelo("Argo 2021");


    //uno2021.ligar();
    //uno2013.setValor(17000);
    System.out.println(uno2013.mostrarInfo());
    System.out.println(uno2021.mostrarInfo());

    //System.out.println(uno2021.getClass() == uno2013.getClass());
    }
}
