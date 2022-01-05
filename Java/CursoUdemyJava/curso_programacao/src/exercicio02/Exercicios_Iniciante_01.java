package exercicio02;

import java.util.Scanner;

public class Exercicios_Iniciante_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		if (x >= 0) {
			System.out.println("NAO NEGAIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
