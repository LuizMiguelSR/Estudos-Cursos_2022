package exercicio02;

import java.util.Scanner;

public class Exercicios_Iniciante_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
