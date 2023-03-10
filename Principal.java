public class Principal {
    public static void main(String[] args) {

        // Sitema Locadora de veiculos
        Locacao locacao1 = new Locacao(15, 12.0, 75.0);

        System.out.println(locacao1.mostrarTela());

        // Sistema Emprestino
        Cliente cliente = new Cliente("Juliana", 20000.00);
        Emprestimo emprestimo = new Emprestimo(cliente, 2000, 11, 10);

        System.out.println(emprestimo.mostrarEmTela());

    }
}
