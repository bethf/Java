package catchUpBeth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PalindromeChecker {

	private static final String SRC_TXT = "resources/Palindrome.txt";
	private static final String WRITE_TXT = "resources/PalindromeChecked.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(SRC_TXT));
		File file = new File(WRITE_TXT);
		BufferedWriter bw = new BufferedWriter(new FileWriter(WRITE_TXT));
		checkEveryLine(in, bw);

		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created");
		}
		
		bw.close();
		in.close();

	}

	public static void checkEveryLine(BufferedReader in, BufferedWriter bw) throws IOException {
		String line;
		while ((line = in.readLine()) != null) {
			boolean isPalindrome = checkEquality(line.toLowerCase());
			displayResults(line, isPalindrome, bw);
			
		}
	}

	private static void displayResults(String originalInput,
			boolean isPalindrome, BufferedWriter bw) throws IOException {

		if (isPalindrome) {
			System.out.println(originalInput + " is a palindrome");
			bw.write(originalInput + " is a palindrome\n");
			bw.newLine();
		}

		else {
			System.out.println(originalInput + " is not a palindrome");
			bw.write(originalInput + " is not a palindrome\n");
			bw.newLine();
		}

	} 

	public static boolean checkEquality(String originalInput) {

		if (originalInput == null)
			throw new IllegalArgumentException();

		originalInput = originalInput.toLowerCase();

		StringBuilder sb = new StringBuilder();
		for (int i = originalInput.length() - 1; i >= 0; i--) {
			sb.append(originalInput.charAt(i));
		}
		System.out.println(sb + ", " + originalInput);
		return sb.toString().equals(originalInput);

	}
}
