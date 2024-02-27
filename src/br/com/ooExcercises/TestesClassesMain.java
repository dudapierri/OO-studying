package br.com.ooExcercises;

public class TestesClassesMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora calculadora = new Calculadora();
        Calculadora2 calc2 = new Calculadora2();
        Musica2 musica = new Musica2();

        pessoa.escreva();

        calculadora.numero = 10;
        System.out.println(calculadora.calculaDobro());
        System.out.println(calc2.calcula(8));

        musica.artista = "Duda";
        musica.titulo = "Musc1";
        musica.anoDeLancamento = 2024;
        musica.avalia(9);
        musica.avalia(10);
        musica.avalia(8);
        musica.avalia(2);
        musica.exibeFicha();
        System.out.println(musica.totalAvaliacoes());
    }
}
