package exercicio4;

import java.util.Locale;
import java.util.Scanner;

import entities4.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double bought = sc.nextDouble();
		double amount = CurrencyConverter.amountTotal(dollar, bought);
		System.out.printf("Amount to be paid in reais = %.2f\n", amount);
				
		sc.close();

	}

}
