package model;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Vinicius Tertuliano
 * 
 */

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;

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

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double extrato(){
        return this.saldo;
    }

    /**
     * Construtor para inicializar objeto Conta
     */
    void deposita() {}
}
