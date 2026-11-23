import java.util.Scanner;

public class LeitorPedido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os dados do pedido no formato 'codigo;peso;destino': ");
        String entrada = scanner.nextLine();

        if (entrada == null || entrada.trim().isEmpty()) {
            System.err.println("Erro a entrada não pode estar vazia.");
            scanner.close();
            return;
        }

        String[] partes = entrada.split(";", -1);

        if (partes.length != 3) {
            System.err.println("Erro: Formato inválido!");
            System.out.println("Formato esperado: codigo;peso;destino");
            scanner.close();
            return;
        }

        String codigo = partes[0].trim();
        String peso = partes[1].trim();
        String destino = partes[2].trim();

        if (codigo.isEmpty() || peso.isEmpty() || destino.isEmpty()) {
            System.out.println("Erro: campos em branco");
            scanner.close();
            return;
        }

        System.out.println("\n--- Dados do Pedido ---");
        System.out.println("Código:  " + codigo);
        System.out.println("Peso:    " + peso);
        System.out.println("Destino: " + destino);

        scanner.close();
    }
}
