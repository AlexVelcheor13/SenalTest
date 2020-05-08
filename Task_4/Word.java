package Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {
	private String ourWord;

	public Word(String ourWord) {
		super();
		this.ourWord = ourWord;
	}
	
	public int  Count(String word) {
		final String regex = " ";
		int count = 0;
		
		String[] words = this.ourWord.split(regex);
		List<String> list = new ArrayList<>(Arrays.asList(words));
		
		for (String str : list) {
			if (str.toLowerCase().equals(word.toLowerCase())) {
				count++;
			}
		}
		return count;
		
	}
	
}
