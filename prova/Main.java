package prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("Guabirobense");
        ContaCorrente conta;
        boolean sair = false;

        while (!sair) {
            System.out.printf("\n\nEscolha uma das seguintes opções:\n" + "1.Adicionar Conta Corrente\n"
                    + "2.Remover Conta Corrente\n" + "3.Depositar\n" + "4.Sacar\n" + "5.Imprimir Contas Correntes\n" + "6.Sair\n");
            switch (sc.nextInt()) {
                case 1:
                    System.out.printf("\nDigite o nome do titular: ");
                    String nome = sc.next();
                    System.out.printf("\nDigite o email do titular: ");
                    String email = sc.next();
                    System.out.printf("\nDigite o CPF do titular: ");
                    String cpf = sc.next();
                    System.out.printf("\nDigite o numero da conta: ");
                    String numeroConta = sc.next();
                    System.out.printf("\nDigite o numero da agência: ");
                    String numeroAgencia = sc.next();
                    Cliente cliente = new Cliente(nome, email, cpf);
                    conta = new ContaCorrente(numeroAgencia, numeroConta, cliente);
                    banco.adicionaConta(conta);
                    break;
                case 2:
                    System.out.printf("\nDigite o numero da conta(mostrado no item 5.Imprimir Contas Correntes) que deseja remover: ");
                    int numero = sc.nextInt();
                    if (numero < banco.totalDeContas()){
                        try {
                            banco.removeConta(numero);
                            System.out.printf("\nConta removida");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.printf("\nErro: posição inválida.", e.getMessage());
                        }
                    } else {
                        System.out.printf("\nNumero inválido ");
                    }
                    break;
                case 3:
                    System.out.printf("\nDigite o numero da conta em que deseja depositar: ");
                    String num = sc.next();
                    System.out.printf("\nDigite o valor em que deseja depositar: ");
                    double valor = sc.nextDouble();
                    conta = banco.buscaConta(banco, num);
                    if (conta != null) {
                        if (conta.depositar(valor)) {
                            System.out.printf("\nDepósito concluido");
                        } else {
                            System.out.printf("\nNão foi possivel depositar");
                        }
                    } else {
                        System.out.printf("\nEssa conta não existe");
                    }
                    break;
                case 4:
                    System.out.printf("\nDigite o numero da conta em que deseja sacar: ");
                    String nc = sc.next();
                    System.out.printf("\nDigite o valor de que deseja sacar: ");
                    double val = sc.nextDouble();
                    conta = banco.buscaConta(banco, nc);
                    if (conta != null) {
                        if(conta.sacar(val)) {
                            System.out.printf("\nSaque concluido");
                        } else {
                            System.out.printf("\nNão foi possivel sacar");
                        }
                    } else {
                        System.out.printf("\nEssa conta não existe");
                    }
                    break;
                case 5:
                    System.out.printf(banco.toString());
                    break;
                case 6:
                    System.out.printf("\n\nBoa noite!!\n\n");
                    sair = true;
                    sc.close();
                    break;
            }
        }
    }

}
