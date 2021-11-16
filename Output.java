package hackthon;

import java.util.ArrayList;

public class Output { //Output of the SensitiveChecker 
	
	private Boolean indicator;
	private String message;
//	private ArrayList<String> sensitive = null;
//	private int count = 0;
	
	
	public Output() {
		
		this.indicator = false;
		
	}
	
	public void setIndicator(Boolean indicator) {
		this.indicator = indicator;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Boolean getIndicator() {
		return this.indicator;
	}
	
	public String getMessage() {
		return this.message;
	}
	
//	public void addtoList(String input) {
//		sensitive.add(input);
//		count++;
//	}
//	
//	public int getCount() {
//		return this.count;
//	}
	

}
