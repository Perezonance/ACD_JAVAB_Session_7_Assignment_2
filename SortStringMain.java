package assignment_2;

public class SortStringMain {
	public static void main(String[] args) {
		String s = "This is the String that will be sorted.";
		
		String[] sArr = s.split(" ");
		
		
		
		for (String string : sArr) {
			char[] cArr = string.toCharArray();
			for (char c : cArr) {
				System.out.print(c + ", ");
			}
			System.out.println();
		}
	}
}
