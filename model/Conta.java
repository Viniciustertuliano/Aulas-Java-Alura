package model;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Vinicius Tertuliano
 * 
 */

public class Conta implements Comparable<Conta>{

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(){}

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }



    public void deposita(double valor){
        this.saldo += valor;
    }

    public double extrato(){
        return this.saldo;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia){
            return false;
        }

        if(this.numero != outra.numero){
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outra){
        return Double.compare(this.saldo, outra.saldo);
    }

    public String toString(){
        return "Numero: "+ this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }
}
