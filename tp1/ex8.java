import java.util.Scanner;

public class MenuLogistica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n======================= MENU ========================");
            System.out.println("1 <--> Converter temperatura");
            System.out.println("2 <--> Converter distância");
            System.out.println("3 <--> Classificar pedido");
            System.out.println("4 <--> Sair");

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
                    classificarPedido(scanner);
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }


    public static void converterTemperatura(Scanner scanner) {

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

    public static void converterDistancia(Scanner scanner) {

        System.out.print("Digite a distância em quilômetros: ");
        double km = scanner.nextDouble();

        double metros = km * 1000;

        System.out.println("Distsncia em metros: " + metros);
    }

    public static void classificarPedido(Scanner scanner) {

        System.out.print("Digite o peso do pedido: ");
        double peso = scanner.nextDouble();

        if (peso > 20) {
            System.out.println("Pedido urgente");
        } else if (peso >= 10) {
            System.out.println("Pedido padrao");
        } else if (peso >= 1) {
            System.out.println("Pedido leve");
        } else {
        	System.out.print("Erro: Valores negativos ou Zero!!!");
        }
        
    }
}
