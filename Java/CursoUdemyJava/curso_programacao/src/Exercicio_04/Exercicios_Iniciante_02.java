package Exercicio_04;

import java.util.Scanner;

public class Exercicios_Iniciante_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, somin = 0, somout = 0;
		
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somin++;
			} else {
				somout++;
			}
		}
		
		System.out.println(somin + " in");
		System.out.println(somout + " out");
		
		sc.close();

	}

}
