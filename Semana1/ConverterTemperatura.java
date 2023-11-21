import java.util.Scanner;

public class ConverterTemperatura {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Insira a temperatura: ");
	        double temperatura = scanner.nextDouble();

	        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
	        char unidadeOrigem = scanner.next().charAt(0);

	        
	        double resultado = 0.0;

	        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
	            
	            resultado = (temperatura * 9 / 5) + 32;
	            System.out.println(temperatura + " Celsius é equivalente a " + resultado + " Fahrenheit.");
	        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
	            
	            resultado = (temperatura - 32) * 5 / 9;
	            System.out.println(temperatura + " Fahrenheit é equivalente a " + resultado + " Celsius.");
	        } else {
	            
	            System.out.println("Unidade de origem inválida. Use 'C' para Celsius ou 'F' para Fahrenheit.");
	        }

	       
	        scanner.close();
	    }
	}



