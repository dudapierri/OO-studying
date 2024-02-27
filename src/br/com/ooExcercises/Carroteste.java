package br.com.ooExcercises;

public class Carroteste {
    public static void main(String[] args) {
        Carro carro = new Carro(2013, "Gol", 35000);
        Carro outroCarro = new Carro("Civic", 95000.0);

        System.out.println(carro.ano + " " + carro.modelo + " " + carro.preco);
    }
}
