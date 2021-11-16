package hackthon;

import java.io.IOException;
import java.util.ArrayList;

public class SensitiveChecker {
	
	SensitiveMap map = new SensitiveMap();

	
	public SensitiveChecker() {
		try {
			map.init();
		} catch (IOException e) {
			System.out.println("SensitiveMap Initialization Error");
			e.printStackTrace();
		}
	}
		

	public Output Check(String input) {
		
		Output output = new Output();
				
		
		
		output.setMessage(input);
		
		Boolean inProcess = false;
		
		
		for(int i = 0; i < input.length(); i++) {
									
			if(map.getMap().containsKey(input.charAt(i)+"")){  //found the element 
				if( map.getMap().get(input.charAt(i)+"").getFirstWord()){
					inProcess = true;
				}
				
			}
			
							
			if(inProcess && map.getMap().get(input.charAt(i)+"").getNextKey().contains("###")) { //Word is sensitive
								

						output.setIndicator(true);
						
						inProcess = false;
							
						output.setMessage("Sensitive Word Found!");
						
						return output;
				}


			if( (i+1 < input.length()) && map.getMap().containsKey(input.charAt(i)+"") && !map.getMap().get(input.charAt(i)+"").getNextKey().contains(input.charAt(i+1)+"")) {
				inProcess = false;
			}
			
		}
		
		return output;
		
	}
	
	
	
}
