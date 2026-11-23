public class PedidoTeste {

    public static void main(String[] args) {
        // Exercício 6
        Endereco end1 = new Endereco("Av. Paulista, 1000", "São Paulo");
        Endereco end2 = new Endereco("Rua das Flores, 50", "Porto Alegre");

        Pedido ped1 = new Pedido("ABC1001", 12.5, end1);
        Pedido ped2 = new Pedido("ABC1002", 5.0, end2);
        Pedido ped3 = new Pedido("ABC1003", 22.0);

        System.out.println("Pedido 1: Código=" + ped1.getCodigo() + ", Peso=" + ped1.getPeso() + ", Destino=" + ped1.getEndereco());
        System.out.println("Pedido 2: Código=" + ped2.getCodigo() + ", Peso=" + ped2.getPeso() + ", Destino=" + ped2.getEndereco());
        System.out.println("Pedido 3: Código=" + ped3.getCodigo() + ", Peso=" + ped3.getPeso() + ", Destino=" + ped3.getEndereco());
        System.out.println();

        // Exercício 7
        for (int i = 1; i <= 5; i++) {
            Pedido p = new Pedido("SEQ000" + i, i * 4.5, new Endereco("Rua Central, " + i, "Belo Horizonte"));
            System.out.println(p.obterResumo());
        }
        System.out.println();

        // Exercício 8
        Pedido pedidoTestePeso = new Pedido("PES1234", 18.0);
        System.out.println("Peso inicial: " + pedidoTestePeso.getPeso());
        boolean alterouInvalido = pedidoTestePeso.setPeso(-10.0);
        System.out.println("Tentativa com -10.0 aceita? " + alterouInvalido);
        System.out.println("Peso atual: " + pedidoTestePeso.getPeso());
        boolean alterouValido = pedidoTestePeso.setPeso(25.5);
        System.out.println("Tentativa com 25.5 aceita? " + alterouValido);
        System.out.println("Peso atualizado: " + pedidoTestePeso.getPeso());
        System.out.println();

        // Exercício 9
        Pedido pedidoUrgente = new Pedido("URG9999", 3.2, new Endereco("Rua Expressa, 10", "Brasília"), Prioridade.URGENTE);
        DespachoPedido despacho = new DespachoPedido(pedidoUrgente.getCodigo(), pedidoUrgente.getPrioridade());
        System.out.println("Despacho: " + despacho);
        System.out.println();

        // Exercício 10
        Pedido pA = new Pedido("FIN1001", 10.0, new Endereco("Rua A, 1", "Salvador"));
        Pedido pB = new Pedido("FIN1002", 20.0, new Endereco("Rua B, 2", "Fortaleza"));
        Pedido pC = new Pedido("FIN1003", 30.0, new Endereco("Rua C, 3", "Manaus"));
        Pedido pD = new Pedido("FIN1004", 40.0, new Endereco("Rua D, 4", "Recife"));

        System.out.println(pA.obterResumo());
        System.out.println(pB.obterResumo());
        System.out.println(pC.obterResumo());
        System.out.println(pD.obterResumo());
        System.out.println("\nTotal de pedidos criados no sistema: " + Pedido.getTotalPedidosCriados());
    }
}
