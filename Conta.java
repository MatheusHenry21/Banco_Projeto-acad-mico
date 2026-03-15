import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private static int count = 0;

    // atributos
    // private, public, default (intermediário entre public e private)
    private int numero;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Transacao> transacoes;

    public Conta(double saldo, Cliente cliente){
        Conta.count++;
        this.numero = count;
        this.cliente = cliente;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }

    // Getters e Setters

    public void setNumero(int numero){
        if(numero > 0){
            this.numero = numero;
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    // métodos
    public boolean sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
            transacoes.add(new Transacao("SAQUE", valor, new Date(), ""));
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            // guardar transacao
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean transferir(Conta outraConta, double valor){
        if(this.sacar(valor)){
            outraConta.depositar(valor);
            // guardar transacao
            return true;
        }
        return false;
    }

    public static int getQuantidadeDeContas(){
        return Conta.count;
    }

    public String getResumo(){
        String resultado = "";
        resultado += "Número: " + numero + "\n";
        resultado += "Saldo: " + saldo + "\n";
        resultado += "Cliente: " + cliente.getNome() + "\n";
        // Mostras as operações realizadas na conta
        // mostrar transações
        return resultado;
    }
}
