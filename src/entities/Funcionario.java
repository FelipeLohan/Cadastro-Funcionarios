package entities;

public class Funcionario {
    protected String nome;
    protected Integer horas;
    protected double valorPorHora;
    protected double salario;

    

    public Funcionario() {
    }

    

    public Funcionario(String nome, Integer horas, double valorPorHora) {
        super();
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }



    public void pagamento(){
        this.salario = this.horas * this.valorPorHora;
        
    }



    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", horas=" + horas + ", valorPorHora=" + valorPorHora + ", salario="
                + salario + "]";
    }

    
}
