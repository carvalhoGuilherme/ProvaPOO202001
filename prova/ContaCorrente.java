package prova;

public class ContaCorrente {
    
    private String numeroAgencia;
    private String numeroConta;
    private Cliente cliente;
    private Double saldo;

    public ContaCorrente(String numeroAgencia, String NumeroConta, Cliente cliente) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = NumeroConta;
        this.cliente = cliente;
        this.saldo = 0d;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    protected boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }
        
    protected boolean depositar(double valor) {
        if (valor > 0d) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return this.cliente.toString() + 
               "\nAgência: " + numeroAgencia + 
               "\nConta: " + numeroConta + 
               "\nSaldo: " + saldo;
    }
    
    
    
}
