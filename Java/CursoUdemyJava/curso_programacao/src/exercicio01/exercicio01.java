package exercicio01;
import java.util.Locale;

public class exercicio01 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double meassure = 53.234567;
		
		System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n", product1, price1, product2, price2);
		System.out.printf("\nRecord: %d year old, code %d and gender: %c\n", age, code, gender);
		System.out.printf("\nMeassure with eight decimal places: %.8f", meassure);
		System.out.printf("\nRouded (three decimal places): %.3f", meassure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", meassure);

	}

}
