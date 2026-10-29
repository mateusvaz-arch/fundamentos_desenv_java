import java.util.Scanner;

/*
 * Usei IA generativa para ajudar a entender a estrutura do menu e revisar o código.
 * A lógica dos exercícios foi organizada em métodos para evitar repetição.
 * Também usei a IA para esclarecer o funcionamento de switch, do-while e Scanner.
 */

public class MenuLogistica {

    static int totalLeves = 0;
    static int totalIntermediario = 0;
    static int totalPesados = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n=================== MENU LOGISTICA ===================");
            System.out.println("1 - Converter temperatura");
            System.out.println("2 - Converter distância");
            System.out.println("3 - Classificar pedidos");
            System.out.println("4 - Mostrar contadores");
            System.out.println("5 - Sobre");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    converterTemperatura(scanner);
                    break;

                case 2:
                    converterDistancia(scanner);
                    break;

                case 3:
                    classificarPedidos(scanner);
                    break;

                case 4:
                    mostrarContadores();
                    break;

                case 5:
                    mostrarSobre();
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção invslida.");
            }

        } while (opcao != 6);

        scanner.close();
    }

    public static void converterTemperatura(Scanner scanner) {

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(
            celsius + " °C equivalem a " + fahrenheit + " °F."
        );
    }

    public static void converterDistancia(Scanner scanner) {

        System.out.print("Digite a distancia em quilometros: ");
        double quilometros = scanner.nextDouble();

        double metros = quilometros * 1000;

        System.out.println(
            quilometros + " km equivalem a " + metros + " metros."
        );
    }

    public static void classificarPedidos(Scanner scanner) {

        double peso;

        System.out.println("\n=================== CLASSIFICAÇÃO DE PEDIDOS ===================");
        System.out.println("Digite -1 para voltar ao menu.");

        System.out.print("Digite o peso do pedido: ");
        peso = scanner.nextDouble();

        while (peso != -1) {

            if (peso > 20) {
                System.out.println("Pedido Pesado.");
                totalPesados++;
            } else if (peso >= 10) {
                System.out.println("Pedido intermediario.");
                totalIntermediario++;
            } else if (peso >= 0) {
                System.out.println("Pedido leve.");
                totalLeves++;
            } else {
            	System.out.print("Erro: Valores negativos ou Zero!!!");
            }
            System.out.print("\nDigite outro peso (-1 para voltar): ");
            peso = scanner.nextDouble();
        }
    }

    public static void mostrarContadores() {

        System.out.println("\n===================== CONTADORES =====================");

        System.out.println("Pedidos leves: " + totalLeves);
        System.out.println("Pedidos Intermediarios: " + totalIntermediario);
        System.out.println("Pedidos Pesados: " + totalPesados);

        int totalPedidos = totalLeves + totalIntermediario + totalPesados;

        System.out.println("Total de pedidos: " + totalPedidos);
    }

    public static void mostrarSobre() {

        String versaoJava = System.getProperty("java.version");

        System.out.println("\n===================== SOBRE =====================");

        System.out.println("Versão do Java: " + versaoJava);

        System.out.println(
            "Este programa pode funcionar em diferentes sistemas operacionais " +
            "sem alteraçoes porque o Java executa o codigo atravees da JVM."
        );
    }
}
