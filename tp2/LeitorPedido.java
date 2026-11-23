import java.util.Scanner;

public class LeitorPedido {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o pedido (codigo;peso;destino): ");
        String pedido = in.nextLine();

        if (pedido.isBlank()) {
            System.err.println("Erro: Pedido não informado ou linha vazia.");
            in.close();
            return;
        }

        String[] campos = pedido.split(";", -1);

        if (campos.length != 3) {
            System.err.println("Erro: Formato inválido!");
            System.err.println("Exemplo esperado: ABC1234;12.5;Rio de Janeiro");
            in.close();
            return;
        }

        String codigo = campos[0].trim();
        String peso = campos[1].trim();
        String destino = campos[2].trim();

        if (codigo.isBlank() || peso.isBlank() || destino.isBlank()) {
            System.err.println("Erro: Nenhum dos três campos pode ficar em branco.");
            in.close();
            return;
        }

        System.out.println("\n--- Dados do Pedido ---");
        System.out.println("Código:  " + codigo);
        System.out.println("Peso:    " + peso);
        System.out.println("Destino: " + destino);

        in.close();
    }
}
