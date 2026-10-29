import java.util.Scanner;

public class ClassificadorPedido {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    
    	int leve = 0;
    	int pesado = 0;
    	int intermediario = 0;
    	
    	double peso;
    	System.out.print("Digite o peso do pedido: ");
    	peso = scanner.nextDouble();
  	   	
    	while (peso != -1) {
  	
	    	if (peso > 20.0) {
	    		pesado++;
	    	} else if (peso >= 10) {
	    		intermediario++;
	    	} else if (peso >= 1){
	    		leve++;
	    	} else {
	    		System.out.print("Erro: Valores negativos ou Zero!!!");
	    	}
	    	
	    	System.out.print("\nDigite outro peso (digite '-1' para sair): ");
	    	peso = scanner.nextDouble();
	    	
    	}
    	System.out.println("-----------------------------------------------------");
    	System.out.println("Peso leve: " + leve );
    	System.out.println("Peso intermediario: " + intermediario);
    	System.out.println("Peso acima do limite: " + pesado);
    	System.out.println("Programa encerrado...");
    	scanner.close();
    }
}
