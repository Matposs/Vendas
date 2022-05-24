package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public boolean cadastrar(Cliente cliente) {
        // for (Cliente clienteCadastrado : clientes){
        //     if (clienteCadastrado.getCpf().equals(cliente.getCpf())){
            if (buscarPorCpf(cliente.getCpf()) != null){
                return false;
            }
        clientes.add(cliente);
        return true;
    } 

    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorCpf(String cpf){
        for (Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

}
