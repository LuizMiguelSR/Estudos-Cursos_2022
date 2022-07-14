package secao06Arrays;

import java.util.Scanner;

public class TwoDTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] nums = new int[3][2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println("Enter a value for row " + i + ", column " + j);
				nums[i][j] = in.nextInt();
			} // fim for
		} // fim for
	}// fim do método main
}// fim da classe TwoDTester
