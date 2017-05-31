import java.util.Scanner;

public class BinaryToInt {

	public static void main(String[] args) {
		int original;
		String originalString = null;
		Scanner scan = new Scanner(System.in);
		
		while (originalString == null){
			System.out.println("Please enter a binary number: ");
			while (!scan.hasNextInt()){
				System.out.println("must be an integer");
				scan.next();
			}
			original = scan.nextInt();
			originalString = Integer.toString(original);
			if (
				originalString.indexOf("2") != -1 ||
				originalString.indexOf("3") != -1 ||
				originalString.indexOf("4") != -1 ||
				originalString.indexOf("5") != -1 ||
				originalString.indexOf("6") != -1 ||
				originalString.indexOf("7") != -1 ||
				originalString.indexOf("8") != -1 ||
				originalString.indexOf("9") != -1
			) {
				originalString = null;
				System.out.println("binary numbers only contain 0 and 1, please try again.");
			}
		}
		
		int index;
		int total = 0;
		for(int i = 0; i < originalString.length(); i++) {
			index = originalString.length() - i -1;
			if (originalString.charAt(index) == '1'){
				total += Math.pow(2, i);
			}
		}
		System.out.println("The binary number is: " + total);
		
	}

}
