package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {

    public void renderizar(){
        Funcionario funcionario = new Funcionario();        
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));        
        boolean cadastrado = funcionarioController.cadastrar(funcionario);
        if (cadastrado){
        System.out.println("\fFuncionário cadastrado !!!");
        }
        else{
            System.out.println("\n CPF já cadastrado !!!");
        }
    }
    
}
