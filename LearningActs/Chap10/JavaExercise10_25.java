package Chap10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaExercise10_25 {
	static class StringSplit {

		public static String[] split(String s, String regex) {

			ArrayList<Character> splitters = new ArrayList<>();
			for (char letter : regex.toCharArray()) {
				if (letter == '[' || letter == ']')
					continue;
				splitters.add(letter);
			}
			String sString = "";
			ArrayList<String> splitter = new ArrayList<>();
			if (regex == null || regex.length() < 1) {
				return new String[] { "" };
			}

			for (int i = 0; i < s.length(); i++) {
				if (splitters.contains(s.charAt(i))) {
					if (sString.length() > 0) {
						splitter.add(sString);
						sString = "";
					}

					splitter.add(s.charAt(i) + "");
					i++;
					while (i < s.length()) {
						if (!splitters.contains(s.charAt(i))) {
							sString = sString.concat(s.charAt(i) + "");
						} else {
							splitter.add(sString);
							sString = "";
							splitter.add(s.charAt(i) + "");
							break;
						}
						i++;
					}
				} else {
					sString = sString.concat(s.charAt(i) + "");
				}
			}
			if (sString.length() > 0) {
				splitter.add(sString);
			}
			return splitter.toArray(new String[] {});

		}

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter String to split (#): ");
			String s = input.next();
			System.out.println("Enter another String to split ([?#]): ");
			String s2 = input.next();

			System.out.println(s + " ---> 	" + Arrays.toString(split(s, "#")));
			System.out.println(s2 + " ---> 	" + Arrays.toString(split(s2, "[?#]")));
			input.close();

		}
	}

}
