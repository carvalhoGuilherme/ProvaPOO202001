package prova;

import java.util.ArrayList;

public class Banco {
    
    private String nomeBanco;
    private ArrayList<ContaCorrente> contas =  new ArrayList<>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public ArrayList<ContaCorrente> getContas() {
        return this.contas;
    }
    
    public void adicionaConta(ContaCorrente contaCorrente) {
        this.contas.add(contaCorrente);
    }
    
    public void removeConta(int indexArray) {
        this.contas.remove(indexArray);
    }
        
    public void depositar(int indexArray, double valor) {
        this.contas.get(indexArray).depositar(valor);
    }
            
    public void sacar(int indexArray, double valor) {
        this.contas.get(indexArray).sacar(valor);
    }
               
    public int totalDeContas() {
       return this.contas.size();
    }

    public ContaCorrente buscaConta(Banco banco, String numeroconta) {
        ContaCorrente conta = null;
        if (!this.getContas().isEmpty()) {
            for (ContaCorrente cc : this.getContas()) {
                if (cc.getNumeroConta().equals(numeroconta)) {
                    conta = cc;
                }
            }
        }
        return conta;
    }
        
    @Override
    public String toString() {
        int i = 0;
        String retorno = "\n" + i + "\n\nBanco: " + nomeBanco;
        if (!this.getContas().isEmpty()) {
            for (ContaCorrente conta : this.contas) {
                retorno += "\n\nConta " + i + conta.toString() + "\n";
                i++;
            }
        } else {
            retorno = "\nBanco não possui contas";
        }    
        return retorno;
    }

}
