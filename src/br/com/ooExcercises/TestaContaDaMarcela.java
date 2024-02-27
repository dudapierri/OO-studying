package br.com.ooExcercises;

public class TestaContaDaMarcela {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(1,1);
        Cliente marcela = new Cliente();
        contaDaMarcela.setTitular(marcela);

        contaDaMarcela.getTitular().setNome("Marcelinha da Silva Sauro");
        marcela.setCpf("999.999.999-42");
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
