package entities4;

public class CurrencyConverter {
	
	public static double IOF = 1.06;
	
	public static double amountTotal(double dollar, double bought) {
		return (bought * dollar) * IOF;
	}

}
