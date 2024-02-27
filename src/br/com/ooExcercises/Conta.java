package br.com.ooExcercises;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //private Cliente titular = new Cliente();

    private static int total; // esse total é da classe

   //Construtor
   public Conta(int agencia, int numero) {
       total++;
       System.out.println("Total de contas é " + total);
       this.agencia = agencia;
       this.numero = numero;

   }




    public void deposita(double valor){
        this.saldo += valor;
        //System.out.println("Depósito feito!");

    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }

    }

    public boolean transfere(double valor, Conta destino)
    {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int valor){
        if(numero <=0){
            System.out.println("Não pode!");
            return;
        }
        this.numero = valor;
    }

    public int getAgencia() {

        return this.agencia;
    }

    public void setAgencia(int agencia){

        if(agencia <=0){
            System.out.println("Não pode! Valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static int getTotal(){
       return Conta.total;
    }




}
