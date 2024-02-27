package br.com.ooExcercises;

public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " +ano);
        boolean incluidoNoPlano = false;
        double notaDoFilme  = 8.0;

        //média das notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("média: " + media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(String.format("O filme tem %d estrelas",classificacao));

        /*String sinopse2 = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse2);

        */

        /*
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);*/
    }
}
