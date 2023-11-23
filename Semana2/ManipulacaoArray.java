package manipulação;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class ManipulaArray {
	public int[] criarArray() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os números separados por espaço: ");
		String[]numeroString = scanner.nextLine().split(" ");
		int[] array = Arrays.stream(numeroString).mapToInt(Integer::parseInt).toArray();
		
		return array;
	}
	
	public int[] criarArrayDois(int tamanho) {
		int[] array = new int[tamanho];
		Random random = new Random();
		
		for (int i = 0; i < tamanho; i++) {
			array[i] = random.nextInt(100) + 1;
		}
		
		return array;
		
	}
	
	public int calcularSoma(int[] array) {
		return Arrays.stream(array).sum();
	}
	
	public int encontrarMaior(int[] array) {
		return Arrays.stream().max().orElseThrow();
	}
	
	public int encontrarMenor(int[] array) {
		return Arrays.stream().min().orElseThrow();
	}
	
	public static void main(String[] args) {
		ManipulaArray manipulador = new ManipulaArray();
		
		int[] arrayCria = manipulador.criarArray();
		System.out.println("Array 1: " + Arrays.toString(arrayCria));
		
		
		int[] arrayDois = manipulador.criarArrayDois(6);
		System.out.println("Array dois: " + Arrays.toString(arrayDois));
	}
		
		
}
