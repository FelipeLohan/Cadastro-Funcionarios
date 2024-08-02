package entities;

public class FuncionarioTerceirizado extends Funcionario {


    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora){
        super(nome, horas, valorPorHora)
    }
    
    public double bonusAdicional(){
        double pagamentoNormal = pagamento();
        return pagamentoNormal * 1000/10;
    }
}
