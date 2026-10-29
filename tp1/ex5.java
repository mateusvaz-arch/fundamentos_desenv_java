public class ConversorUnidades {
    public static void main(String[] args) {
		double celsius  = 25.5;
		
		double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		
		double valorReferenciaTemp = 80.0;
		
		System.out.println("Temperatura: " + celsius + "°C equivale a " + fahrenheit + "°F");
		 
		if (fahrenheit > valorReferenciaTemp) {
	            System.out.println("O resultado (" + fahrenheit + "°F) é MAIOR que o valor de referência (" + valorReferenciaTemp + "°F).");
	        } else if (fahrenheit < valorReferenciaTemp) {
	            System.out.println("O resultado (" + fahrenheit + "°F) é MENOR que o valor de referência (" + valorReferenciaTemp + "°F).");
	        } else {
	            System.out.println("O resultado (" + fahrenheit + "°F) é IGUAL ao valor de referência (" + valorReferenciaTemp + "°F).");
	        }
	        
	        System.out.println("------------------------------------------------------------------------");
        int quilometros = 100;
        
//         Fator de conversão aproximado: 1 km = 0.621371 milhas
        double fatorConversao = 0.621371;
        double milhas = quilometros * fatorConversao;
        
        System.out.println("Distância: " + quilometros + " km equivale a " + milhas + " milhas.");
     
    }
}
