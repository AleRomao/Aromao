package br.sp.senac.e169.calcularareaperimetro;

public class Paciente {
    //Atributos
    private String nome;
    private int idade;
    private int historicoConsulta;
    //Construtor
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsulta = 0;
    }
    //Métodos Getter/Setter
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getHistoricoConsulta() {
        return historicoConsulta;
    }

    public void setHistoricoConsulta(int historicoConsulta) {
        this.historicoConsulta = historicoConsulta;
    }
    //Métodos
    public void adicionarConsulta() {
        this.historicoConsulta += 1;
    }
    
    public void exibir() {
        System.out.println("+++++ Dados do Paciente +++++");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Consultas: " + this.historicoConsulta);
    }
}
