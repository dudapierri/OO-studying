package br.com.ooExcercises;

public class testaGeterSeter {
    public static void main(String[] args) {
        Conta conta = new Conta(1,1);
        conta.setNumero(1234);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);

        paulo.setNome("Paulo");
        System.out.println(paulo.getNome());

        conta.getTitular().setNome("Ddinha");
        System.out.println(conta.getTitular().getNome());
    }
}
