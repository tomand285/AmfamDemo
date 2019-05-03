public class reverse {

	public static void main(String[] args) {
		String word = "The world's best demo!";
		reverse reverse = new reverse();
		String newWord = reverse.reverseWord(word);
		System.out.println(newWord);
	}
	
	private String reverseWord(String word) {
		String result = "";
		String[] wordArray = word.split("");
		for(int i=wordArray.length-1;i>-1;i--) {
			result += wordArray[i];
		}
		return result;
	}

}
