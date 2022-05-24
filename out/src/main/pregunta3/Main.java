package main.pregunta3;

public class Main {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();

        Cliente cliente1 = new Cliente("Romario", "Escobar", 89745689);
        Cliente cliente2 = new Cliente("Cristina", "Rivera", 45879568);
        Cliente cliente3 = new Cliente("Ximena", "Cuadra", 88888852);

        clienteController.agregarClinte(cliente1);
        clienteController.agregarClinte(cliente2);
        clienteController.agregarClinte(cliente3);

        clienteController.listarCliente();

        Cliente c = clienteController.buscarCliente(88888852);
        c.setNombres("Jimena");
        clienteController.editarCliente(3, c);
        clienteController.listarCliente();

        clienteController.eliminarCliente(3);
        clienteController.listarCliente();
    }
}
