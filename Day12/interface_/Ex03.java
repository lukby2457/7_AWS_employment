package interface_;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] words = new String[] { "Python", "Java", "Go", "C/C++" };
		
		Arrays.sort(words);
		System.out.println("words = " + Arrays.toString(words));
		
		
		Comparator<String> desc = (String o1, String o2) -> {
			// return o1.compareTo(o2);		// o1 - o2
			return o2.compareTo(o1);		// o2 - o1
		};
		
		Arrays.sort(words, desc);
		System.out.println("words = " + Arrays.toString(words));
	}
}	
