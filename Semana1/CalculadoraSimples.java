package calc;
import java.util.Scanner;

	
	public class CalculadoraSimples {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o primeiro numero: ");
			double num1 = scanner.nextDouble();
			
			System.out.println("Digite o segundo numero: ");
			double num2 = scanner.nextDouble();
			
			System.out.println("Escolha a operação: ");
			System.out.println("1- Adição: ");
			System.out.println("2- Subtração: ");
			System.out.println("3- Multiplicação: ");
			System.out.println("4- Divisão: ");
			
			System.out.println("Digite a operação desejada: ");
			int escolha = scanner.nextInt();
			
			double resultado = 0;
			String operacao = "";
			
			switch(escolha) {
			case 1:
				resultado = num1 + num2;
				operacao = "adição";
				break;
				
			case 2:
				resultado = num1 - num2;
				operacao = "subtração";
				break;
				
			case 3:
				resultado = num1 * num2;
				operacao = "multiplicação";
				break;
				
			case 4:
				if (num2 != 0) {
				resultado = num1 / num2;
				operacao = "divisão";
				}
				else {
					System.out.println("Erro: divisão por zero");
					return;
				}
				break;
				
			default:
				System.out.println("Opção inválida. escolha uma operação válida! ");
				return;
			}
			
			    System.out.println("O resultado da " + operacao + " é: " + resultado);
					
				
					
			}
					
			

	}



