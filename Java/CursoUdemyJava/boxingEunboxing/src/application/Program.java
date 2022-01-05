package application;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		
		//Object obj = x;
		
		Integer obj = x; //usando wrapper classes é possível fazer boxing e unboxing de forma mais simples
		
		System.out.println(obj);
		
		//int y = (int) obj;
		
		int y = obj * 2; //com wrapper classes é possível fazer operações sem converter
		
		System.out.println(y);

	}

}
