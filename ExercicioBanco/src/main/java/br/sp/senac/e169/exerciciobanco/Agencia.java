package br.sp.senac.e169.exerciciobanco;

public class Agencia extends ContaBanco {

    private ContaBanco conta[];
    protected double porcP = 0, porcE = 0, saldoP = 0, saldoE = 0;
    protected int totContaP = 0, totContaE = 0;
    protected int totalConta = 0;

    public Agencia(String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
    }

    public void sorteio() {
        for (int i = 0; i < conta.length; i++) {
            int sorteio = (int) (Math.random() * 1000);
            if (sorteio % 2 == 0) {
                conta[i] = new ContaPoupanca("alexandre", 122545, 1000);
                totContaP++;
            } else {
                conta[i] = new ContaEspecial("renan", 12112, 2000);
                totContaE++;
            }
            conta[i].mostrarExtrato();
        }
        this.totalConta = conta.length;
    }

    public void gerarConta() {
        conta = new ContaBanco[15];
        sorteio();
    }

    public void calcPorcentagem() {
        porcP = ((double) totContaP / totalConta) * 100;
        porcE = ((double) totContaE / totalConta) * 100;
    }

    public void calcSaldo() {

        for (int i = 0; i < conta.length; i++) {
            if (conta[i] instanceof ContaPoupanca) {
                saldoP += conta[i].saldo;
            } else {
                saldoE += conta[i].saldo;
            }
        }
    }

    public void mostrar() {
        System.out.println("\n********** Dados das Contas **********\n");
        System.out.printf(" Porcentagem Conta Poupança: %.2f  \n Porcentagem Conta Especial: %.2f\n"
                + "\n Saldo Conta Poupança: %.2f   \n Saldo Conta Especial: %.2f\n", porcP, porcE, saldoP, saldoE);
        System.out.println("\n**************************************");
    }
}
