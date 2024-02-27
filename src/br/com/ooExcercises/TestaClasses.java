package br.com.ooExcercises;

public class TestaClasses {
    public static void main(String[] args) {
         Cliente paulo = new Cliente();
        /// paulo.nome = "Paulo Silveira";
      //   paulo.cpf = "999.999.999-99";
       //  paulo.profissao = "Programador";

         Conta contadoPaulo = new Conta(1,1);
         contadoPaulo.deposita(100);

        // contadoPaulo.titular = paulo;
      //  System.out.println(contadoPaulo.titular.profissao);
      //   contadoPaulo.titular.profissao = "PROGRAMADOR";
      //  System.out.println(contadoPaulo.titular.profissao);



    }
}
