package exercicio01;

import java.util.Scanner;

public class exerciciosIniciante04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, qtde;
		double vhor, salary;
		num = sc.nextInt();
		qtde = sc.nextInt();
		vhor = sc.nextDouble();
		
		salary = qtde * vhor;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		
		sc.close();

	}

}
