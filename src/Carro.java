public class Carro {

    public final String marca;
    public final String modelo;
    public final int ano;
    public final int kilometragem;
    public final int kmPorLitro;
    public final int potencia;

    public Carro(String marca, String modelo, int ano, int kilometragem, int kmPorLitro, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.kmPorLitro = kmPorLitro;
        this.potencia = potencia;
    }

    public void exibirDetalhes(Carro carro){

        // printa todos as especificaçoes
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Kilometragem: " + this.kilometragem);
        System.out.println("KM por litro: " + this.kmPorLitro);
        System.out.println("Potencia: " + this.potencia+ "CV");

        // instancia e chama o metodo aqui pra nao ter que chamar na main
        CarService carService = new CarService();
        carService.verificaKilometragem(carro);
    }
}
