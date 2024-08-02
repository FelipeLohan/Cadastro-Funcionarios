import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario func = new Funcionario("Rodolfo", 100, 10.0);

        FuncionarioTerceirizado funcTer = new FuncionarioTerceirizado("Carlos", 100, 12.0);

        func.pagamento();
        
    }
}
