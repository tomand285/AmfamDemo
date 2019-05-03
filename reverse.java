public class reverse {

	public static void main(String[] args) {
		String w = "What is this?";
		reverse r = new reverse();
		String nw = r.reverseWord(w);		
		System.out.println(nw);
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
