import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToWordsConverter {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety" 	
	};
	
	public static String numconvert(final int n) {
		
		if (n < 0) {
			return "Minus " + numconvert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + numconvert(n % 100);
		}

		if (n < 100000) {
			return numconvert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + numconvert(n % 1000);
		}

		if (n < 10000000) {
			return numconvert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + numconvert(n % 100000);
		}

		return numconvert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + numconvert(n % 10000000);
		
	}
	public static String convert(String input) {
		String output = "";
		try {
			
			int n =Integer.parseInt(input);
			
			output = numconvert(n);
			
		} catch(InputMismatchException nfe) {
			nfe.printStackTrace();
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		return output;
	}
	public static void main(final String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to convert into word format");
		
		convert(s.nextLine());
	}
	
}
