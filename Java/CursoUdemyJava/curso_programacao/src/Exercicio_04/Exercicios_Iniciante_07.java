package Exercicio_04;

import java.util.Scanner;

public class Exercicios_Iniciante_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
		}

		in.close();

	}

}
