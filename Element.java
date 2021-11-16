package hackthon;

import java.util.LinkedList;

public class Element {
	
	LinkedList<String> nextKey = new LinkedList<>();
		
	Boolean firstword = false;
	
	public Element() {
		nextKey.addFirst("###");
	}
	
	public Element(String input) {
		nextKey.addFirst(input);
	}
	
	public LinkedList<String> getNextKey(){
		return this.nextKey;
	}
	
	
	public void setNextKey(String input) {
		nextKey.addFirst(input);
	}
	
	
	public Boolean getFirstWord() {
		return firstword;
	}
	
	public void setFirstWord(Boolean input) {
		firstword = input;
	}

}
