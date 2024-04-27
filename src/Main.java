import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/***
		 * 1. save the icon in a string array. each element is a string represent a line of the icon
		 * 2. input the scale.
		 * 3. for each line of the icon, print the scaled line scale times. That is, for each line
		 * 	3.1 for each character in the original line, print the character scale times.
		 * 	
		 */
		String[] icon = {"*x*", " xx", "* *"};
		Scanner sc = new Scanner(System.in);
		int scale = sc.nextInt();
		
		for (int i=0;i<icon.length;i++) { // loop for every line in the icon.
			String line = icon[i]; // get one line.
			for (int j=0;j<scale;j++) { // for this line I need to print scale lines.
				// I need to print one scaled line.
				for (int k=0;k<line.length();k++) { // for each character in the original line
					char c = line.charAt(k); // get the kth character of current original line.
					// I need to print the character scale times.
					for (int l=0;l<scale;l++) { //loop scale times to print the current character.
						System.out.print(c);
					}
				}
				System.out.println();
			}
		}
	}

}
