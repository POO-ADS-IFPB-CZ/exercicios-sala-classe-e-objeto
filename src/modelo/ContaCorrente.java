package modelo;

import java.time.LocalTime;

public class ContaCorrente {

    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo;

    public ContaCorrente(Cliente cliente, int agencia, int numero){
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        if(valor > 5000 || valor<=0) return false;
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(LocalTime.now().isAfter(LocalTime.of(22,0))
            && LocalTime.now().isBefore(LocalTime.of(6,0))
                && valor>300
        ) return false;
        if(valor > 2000 || valor <=0) return false;
        if(valor > saldo) return false;
        saldo -= valor;
        return true;
    }

}
