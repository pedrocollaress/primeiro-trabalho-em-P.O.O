
public class Main {
    public static void main(String[] args) {


        Carro c1 = new Carro("Nissan", "Skyline", 2001, 1000000, 9, 320);
        Carro c3 = new Carro("Toyota", "Supra", 2000, 700000, 7, 340);

        c1.exibirDetalhes(c1);
        c3.exibirDetalhes(c3);

        CarService carService = new CarService();
        carService.comparaCarro(c1, c3);

        }
}