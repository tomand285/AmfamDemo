public class reverse {

	public static void main(String[] args) {
		String word = "The world's best demo!";
		String newWord = reverseWord(word);
		System.out.println(newWord);
	}
	
	private static String reverseWord(String word) {
		String result = "";
		String[] wordArray = word.split("");
		for(int i=wordArray.length-1;i>=0;i--) {
			result += wordArray[i];
		}
		return result;
	}

}
