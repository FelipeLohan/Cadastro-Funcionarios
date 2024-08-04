package entities;

public class FuncionarioTerceirizado extends Funcionario {

    private double salarioAdicional;
    private double salarioTotal;
    
    public FuncionarioTerceirizado(String nome, Integer horas, double valorPorHora, double salarioAdicional){
        super(nome, horas, valorPorHora);
        this.salarioAdicional = salarioAdicional;
    }
    
    @Override
    public void pagamento(){
        this.salario = this.horas * this.valorPorHora;
        this.salarioTotal += this.salario + this.salarioAdicional;
    }

    @Override
    public String toString() {
        return "FuncionarioTerceirizado [nome=" + nome + ", horas=" + horas + ", salarioAdicional=" + salarioAdicional
                + ", valorPorHora=" + valorPorHora + ", salarioTotal=" + salarioTotal + ", salario=" + salario + "]";
    }

    
}
