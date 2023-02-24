package Chap10;

import LearningActs.StrBuild;

public class JavaExercise10_28 {
	static class MyStringBuilder2 {
		char[] ch;
		int x;
		StringBuilder stb = new StringBuilder();

		public MyStringBuilder2() {
			StringBuilder stb = new StringBuilder();
			stb.append("Chinita");
			System.out.println("String = " + stb.toString());
		}

		public MyStringBuilder2(char[] chars) {
			ch = chars;
			x = chars.length;

		}

		public MyStringBuilder2(String s) {
			ch = s.toCharArray();
			x = s.length();
		}

		public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
			stb.insert(12, 's');
			return null;
		}

		public MyStringBuilder2 reverse() {
			StringBuilder reverseStr = stb.reverse();
			System.out.println("Reverse String = " + reverseStr.toString());
			return null;
		}

		public MyStringBuilder2 substring(int begin) {
			System.out.println("String contains = " + stb);
			System.out.println("SubStringe = " + stb.substring(18));
			return null;
		}

		public MyStringBuilder2 toUpperCase() {
			System.out.println("Uppercase: " + stb.toString().toUpperCase());
			return null;
		}

		{

		}

	}

	public static void main(String[] args) {
		char[] ch = { 'I', 'c', 'e', 'B', 'o', 'x' };

		StrBuild stb = new StrBuild("Chinita");
		StrBuild stb1 = new StrBuild(ch);
		StrBuild stb3 = new StrBuild("Chinita");
		System.out.println("Default: " + stb);
		System.out.println("\nUpper case: " + stb.toUpperCase());

		StrBuild stb2 = stb.insert(3, stb1);

		System.out.println("\nSubstring: " + stb2.substring(0));

		System.out.print("\nInsert \"IceBox\"  into \"Chinita\": ---> ");
		System.out.println(stb2);

		System.out.println("\nReverse: " + stb3.reverse());
	}

}
