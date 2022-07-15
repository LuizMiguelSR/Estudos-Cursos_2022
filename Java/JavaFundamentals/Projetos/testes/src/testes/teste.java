package testes;

public class teste {

	public static void main(String[] args) {
		/*
		 * String a1 = "alligator", a2 = "albatross"; if(a1.compareTo(a2)>0) {
		 * System.out.println(a1); } else { System.out.println(a2); }
		 * 
		 * String[] mountains = {"Chimborazo", "Matterhorn", "Olympus", "Everest",
		 * "Kinabalu", "Adriondack", "Blue Ridge", "Zugspitze",}; for(int i = 0;
		 * i<mountains[1].length(); i++) { System.out.println(mountains[i].length()); }
		 * 
		 * String s="\"\"\\\n\""; System.out.println(s);
		 * 
		 * 
		 * int num = 7; while (num >= 0) { num -= 3; } System.out.println(num);
		 * 
		 * String gender = "male"; System.out.print((gender == "male") ? "Mr." : "Ms.");
		 * 
		 * int x = 0; if((5.1 > 4.3 && 6.2 < 8.4) && (7.2 < 3.5 || 1.2 == 2.1 || 2.2 !=
		 * 2.25)) { x = 3; } else { x = 4; } System.out.print(x);
		 * 
		 * 
		 * int num[] = {9,8,7,6,5,4,3,2,1}; for(int i = 0; i < 9; i = i+3) {
		 * System.out.print(num[i]); }
		 * 
		 * Object array = new Object[5]; int x[] = new int[10];
		 */
		
		int array[][] = { { 3, 2, 1 }, { 1, 2, 3 } };
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				System.out.print(2 * array[i][j]);
				
			
		
	}

}
