package main.pregunta3;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    public List<Cliente> clientes;
    public int contador;

    public ClienteController() {
        this.clientes = new ArrayList<>();
        this.contador = 0;
    }
    
    public void agregarClinte(Cliente cliente) {
        this.clientes.add(cliente);
        this.contador++;
    }

    public void listarCliente() {
        for (int i=1; i<=this.clientes.size(); i++) {
            System.out.println("id= " + Integer.toString(i) + " " + this.clientes.get(i - 1));
        }
    }

    public Cliente buscarCliente(int dni) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente: clientes) {
            if (cliente.getDni() == dni) {
                clienteEncontrado = cliente;
            }
        }
        return clienteEncontrado;
    }

    public void editarCliente(int id, Cliente cliente) {
        clientes.set(id - 1, cliente);
    }

    public void eliminarCliente(int id) {
        this.clientes.remove(id - 1);
        this.contador--;
    }
}
