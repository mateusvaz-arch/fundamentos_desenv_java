public class ResumoPedidos {

    public static void exibirResumo(int totalPedidos, double pesoMedio) {
        System.out.printf("Total de Pedidos: %5d | Peso Médio: %.2f kg%n", totalPedidos, pesoMedio);
    }

    public static void main(String[] args) {
        exibirResumo(7, 12.458);
        exibirResumo(1840, 8.5);
        exibirResumo(45, 115.3);
    }
}
