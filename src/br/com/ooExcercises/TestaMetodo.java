package br.com.ooExcercises;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta(1,1);
        //privado - conta.saldo = 100;
        conta.deposita(50);
        conta.deposita(50);
        conta.deposita(50);
        //System.out.println(conta.saldo);

        boolean conseguiuRetirar = conta.saca(300);
       // System.out.println(conseguiuRetirar);
        //System.out.println(conta.saldo);

        Conta contaMarcela = new Conta(1,1);
        Conta contaPaulo = new Conta(1,1);

        contaMarcela.deposita(700);
        contaMarcela.transfere(200,contaPaulo);

        System.out.println(contaMarcela.getSaldo());
        System.out.println(contaPaulo.getSaldo());


    }
}
