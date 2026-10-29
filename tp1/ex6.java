import java.util.Scanner;

public class ClassificadorPedido {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	double peso;
    	System.out.print("Digite o peso do pedido: ");
    	
    	peso = scanner.nextDouble();
    	System.out.println("O peso do pedido foi: " + peso + " Kg");
    	
    	scanner.close();
    	
    	if (peso > 20.0) {
    		System.out.print("Peso acima do limite!");
    	} else if (peso >= 10) {
    		System.out.print("Peso intermediario!");
    	} else if (peso >= 1){
    		System.out.print("Peso leve!");
    	} else {
    		System.out.print("Erro: Valores negativos ou Zero!!!");
    	}
    }
}
