package br.sp.senac.e169.exerciciobanco;

public class Agencia extends ContaBanco {
    
    private ContaBanco conta[];
    
    public Agencia(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
        this.conta = new ContaBanco[15];
    }
    
    public void gerarConta() {
        for (int i = 0; i < conta.length; i++) {
            int sorteio = (int) (Math.random() * 1000);
            if (sorteio % 2 == 0) {
                conta[i] = new ContaBanco("alexandre", 122545, 1000);
            } else {
                conta[i] = new ContaBanco("renan", 12112, 2000);
            }
            conta[i].mostrarExtrato();
        }
    }
    
    public void calcPorcentagem() {
        int totalConta = conta.length;
        int totContaP = 0, totContaE = 0;
        double porcP = 0, porcE = 0;
        
        for (int i = 0; i < conta.length; i++) {
            if (conta[i] instanceof ContaPoupanca) {
                totContaP++;
            }else{
                totContaE++;
            }
            porcP = (totContaP / totalConta) * 100;
            System.out.println("% Conta Poupança: " + porcP);
            porcE = (totContaE / totalConta) * 100;
            System.out.println("% Conta Especial: " + porcE);
        }
    }
    
    public void calcSaldo() {
        double saldoP = 0, saldoE = 0;
        for (int i = 0; i < conta.length; i++) {
            if (conta[i] instanceof ContaPoupanca) {
                saldoP += conta[i].saldo;
            }else{
                saldoE += conta[i].saldo;
            }
        }
        System.out.println("Saldo Conta Poupança: " + saldoP);
        System.out.println("Saldo Conta Especial: " + saldoE);
    }
}
