package prova;

public class Cliente {
    
    private String nomeCliente;
    private String cpf;
    private String email; 

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Cliente(String nomeCliente, String email) {
        this.nomeCliente = nomeCliente;
        this.email = email;
    }

    public Cliente(String nomeCliente, String email, String cpf) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.cpf = cpf;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomeCliente + "\nEmail: " + email + "\nCPF: " + cpf;
    }
   
}
