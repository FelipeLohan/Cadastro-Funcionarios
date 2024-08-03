import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos funcionários você deseja cadastrar?");
         int n = teclado.nextInt();
            teclado.nextLine();
            List<Funcionario> funcionarios = new ArrayList<>();
                for(int i = 0; i < n; i++){
                    int opcao = 0;
                    do{System.out.println("Voce deseja cadastrar um funcionario comum ou terceirizado?");
                    System.out.println("1 - Comum");
                    System.out.println("2 - Terceirizado");
                    System.out.println("3 - Pular");
                        opcao = teclado.nextInt();
                            teclado.nextLine();
                                switch (opcao) {
                                    case 1:
                                        System.out.println("Nome do funcionário:");
                                            String nomeComum = teclado.nextLine();
                                        System.out.println("Horas trabalhadas por ele:");
                                            int horasComum = teclado.nextInt();
                                                teclado.nextLine();
                                        System.out.println("Valor por hora trabalhada:");
                                            double valorPorHoraComum = teclado.nextDouble();
                                                teclado.nextLine();
                                                Funcionario funcionario = new Funcionario(nomeComum, horasComum, valorPorHoraComum);
                                                    funcionarios.add(funcionario);        
                                        break;
                                    case 2:
                                        System.out.println("Nome do funcionário:");
                                            String nomeTerceirizado = teclado.nextLine();
                                        System.out.println("Horas trabalhadas por ele:");
                                            int horasTerceirizado = teclado.nextInt();
                                                teclado.nextLine();
                                        System.out.println("Valor por hora trabalhada:");
                                            double valorPorHoraTerceirizado = teclado.nextDouble();
                                                teclado.nextLine();
                                        System.out.println("Valor adicional:");
                                            double valorAdicional = teclado.nextDouble();        
                                                Funcionario funcionarioTerceirizado = new FuncionarioTerceirizado(nomeTerceirizado, horasTerceirizado, valorPorHoraTerceirizado, valorAdicional);
                                                    funcionarios.add(funcionarioTerceirizado);  
                                        break;

                                    default:
                                        break;
                                }
                    }while(opcao != 1 && opcao != 2);

                }

                for (Funcionario funcionario : funcionarios) {
                    funcionario.pagamento();
                    System.out.println(funcionario.toString());
                }

        
    }
}    

