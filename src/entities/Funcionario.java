package entities;

public class Funcionario {
    protected String nome;
    protected Integer horas;
    protected Double valorPorHora;

    

    public Funcionario() {
    }

    

    public Funcionario(String nome, Integer horas, Double valorPorHora) {
        super();
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }



    public double pagamento(){
        return this.horas * this.valorPorHora;
    }
}
