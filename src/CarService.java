public class CarService {


    // verifica a km
    public void verificaKilometragem(Carro carro){
        if (kmDividoAno(carro)>=10000){
            System.out.print("Mais de 10k de km por ano");
            System.out.println("\n");
        } else {
            System.out.print("Menos de 10k de km por ano");;
            System.out.println("\n");
        }
    }

    // metodo privado que retorna a double da km divido pelos anos de uso, sem contar 2024
    private double kmDividoAno(Carro carro){
        double popCorn = carro.kilometragem;
        double pizza = 2023 - carro.ano;
        double pizzaCorn = popCorn/pizza;
        return pizzaCorn;
    }

    // metodo pra comparar potencias
    public void comparaPotencia(Carro carro, Carro carro2){

        final String APRESENTAR_POTENCIA = " possui mais potencia, um total de ";

        if(carro.potencia>carro2.potencia){
            System.out.println("O "+carro.marca+" "+carro.modelo+APRESENTAR_POTENCIA+ carro.potencia);
        }
        else{
            System.out.println("O "+carro2.marca+" "+carro2.modelo+APRESENTAR_POTENCIA+ carro2.potencia);
        }
    }

    // comapara km por litro
    public void comparaKmPorLitro(Carro carro, Carro carro2){
        final String APRESENTAR_KM_POR_LITRO = " faz mais km por litro, um total de ";

        if(carro.kmPorLitro> carro2.kmPorLitro){
            System.out.println("O "+carro.marca+" "+carro.modelo+APRESENTAR_KM_POR_LITRO+ carro.kmPorLitro);
        }else {
            System.out.println("O "+carro2.marca+" "+carro2.modelo+APRESENTAR_KM_POR_LITRO+ carro2.kmPorLitro);
        }
    }

    // compara os km por ano dos carros
    public void comparaKmPorAno(Carro carro, Carro carro2){

        final String APRESENTAR_MEDIA = " tem uma media de Km por ano menor, um total de ";

        if(kmDividoAno(carro) > kmDividoAno(carro2)){
            System.out.println("O "+carro2.marca+" "+carro2.modelo+APRESENTAR_MEDIA+ kmDividoAno(carro2));
        }else{
            System.out.println("O "+carro.marca+" "+carro.modelo+APRESENTAR_MEDIA+ kmDividoAno(carro));
        }
    }


    // metodo que printa todas as comparacoes
    public void comparaCarro(Carro carro, Carro carro2){
        comparaPotencia(carro, carro2);
        comparaKmPorLitro(carro, carro2);
        comparaKmPorAno(carro, carro2);
    }
}
