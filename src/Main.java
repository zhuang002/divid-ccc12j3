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
		
		// for each line in the icon I need to scalely print the line.
		for (int i=0;i<icon.length;i++) {
			scalelyPrintLine(icon[i], scale);
		}
	}

	private static void scalelyPrintLine(String original, int scale) {
		String scaledLine = getScaledLine(original,scale);
		for (int i=0;i<scale;i++) {
			System.out.println(scaledLine);
		}
		
	}

	private static String getScaledLine(String original, int scale) {
		// TODO Auto-generated method stub
		String rtString = "";
		for (int i=0;i<original.length();i++) {
			char c = original.charAt(i);
			for (int j=0;j<scale;j++) {
				rtString += c;
			}
		}
		return rtString;
	}

}
