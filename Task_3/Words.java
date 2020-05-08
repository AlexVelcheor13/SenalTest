package Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Words {
	private final String regex = " ";
	private String words;
	private int c;
	
	public Words(String words) {
		super();
		this.words = words;
	}
	public String getWords() {
		return words;
	}
	public int getC() {
		return c;
	}
	
	public void doSmth() {
		String[] word = words.split(regex);
		List<String> ourWords = new ArrayList<>(Arrays.asList(word)); 
		for (int i = 0; i < ourWords.size(); i++) {
			ourWords.set(i, ourWords.get(i).substring(0,1).toUpperCase()+ ourWords.get(i).substring(1));
		}
		StringBuilder sb = new StringBuilder();
		Collections.sort(ourWords);
		for (String str : ourWords) {
			sb.append(str).append(regex);
		}
		this.words = sb.toString();
		this.c = ourWords.size();
	}
}
