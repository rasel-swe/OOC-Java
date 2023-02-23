import java.util.Scanner;

public class Array {
	
	public static void main(String[]args) {
		
		Scanner n = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter a sentence: ");
		String x = n.nextLine();
		
		for (int i = 0; i< x.length(); i++) {
			
			char ch = x.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				count++;
			}
			
		}
		System.out.println("The total vowel is: "+count);
		}

}
