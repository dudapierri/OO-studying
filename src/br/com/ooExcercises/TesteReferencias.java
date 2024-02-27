package br.com.ooExcercises;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1,1);
        Conta segundaConta = primeiraConta;

       // primeiraConta.saldo = 300;
      //  System.out.println(primeiraConta.saldo);
       // System.out.println(segundaConta.saldo);
      //  segundaConta.saldo += 100;
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
