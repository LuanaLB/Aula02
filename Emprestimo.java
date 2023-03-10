public class Emprestimo {
    Cliente cliente;
    double valorEmprestimo;
    double taxaJuros;
    int numParcelas;

    public Emprestimo(Cliente cliente, double valorEmprestimo, double taxaJuros, int numParcelas) {
        this.cliente = cliente;
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
        this.numParcelas = numParcelas;
    }

    public void aprovaçao() {
        if (valorEmprestimo > cliente.salarioCliente * 0.30) {
            System.out.println("Emprestimo negado");
            System.exit(0);
        } else
            System.out.println("Emprestimo aceito");

    }

    public void valorParcelas() {
        double valorParc = valorEmprestimo / numParcelas;
        for (int i = 0; i < numParcelas; i++) {
            valorParc += valorParc * (taxaJuros / 100);
            System.out.println("Parcelas: " + valorParc);
        }

    }

    /*
     * String imprimirParcela() {
     * 
     * }
     */

    public double valorTotal() {
        double valorTotal = valorEmprestimo / numParcelas;
        double valorSomado = 0;
        for (int i = 0; i < numParcelas; i++) {
            valorTotal += valorTotal * (taxaJuros / 100);
            valorSomado += valorTotal;
        }
        return valorSomado;
    }

    public String mostrarEmTela() {
        Cliente cliente = new Cliente("Juliana", 20000.00);
        Emprestimo emprestimo = new Emprestimo(cliente, 2000, 11, 10);

        emprestimo.aprovaçao();
        emprestimo.valorParcelas();
        return ("Valor total  já pago:" + emprestimo.valorTotal());
    }

}