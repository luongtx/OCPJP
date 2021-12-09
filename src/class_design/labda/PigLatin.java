package class_design.labda;

interface SuffixFucntion {
	void call();
}

public class PigLatin {
	public static void main(String[] args) {
		String word = "hello";
		SuffixFucntion suffixFucntion = () -> {
			System.out.println(word + "ay");
		};
		// word = "ay";
		suffixFucntion.call();
	}
}
