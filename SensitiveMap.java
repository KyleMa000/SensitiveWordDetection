package hackthon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SensitiveMap {
	
	HashMap<String, Element> map = new HashMap<String, Element>();
	
	public SensitiveMap(){
		
	}
	
	public void addElement(String current, String input) {
		
		if(!map.containsKey(current)) {
			Element next = new Element(input);
			map.put(current, next);
		}
	}
	
	public void addFirst(String current, String input) {
		
		if(!map.containsKey(current)) {
			Element next = new Element(input);
			next.setFirstWord(true);
			map.put(current, next);
		}
	}
		
	
	public HashMap<String, Element> getMap(){
		return this.map;
	}
	
		
	public void init() throws IOException, FileNotFoundException { //initialize map
		
		//loading local sensitive phrases
/*	
		File file = new File("C:\\Users\\chime\\Desktop\\Data\\banword.json");
        FileReader fileReader = new FileReader(file);
        Reader reader = new InputStreamReader(new FileInputStream(file), "Utf-8");
        
        int ch = 0;
        StringBuffer sb = new StringBuffer();
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch + "");
        }
        fileReader.close();
        reader.close();  
        
        String[] temp = sb.toString().split(",");
        
        for(int i = 0; i < temp.length; i++) {
        	temp[i] = unescapeUnicode(temp[i]);
        	//System.out.println(temp[i]);
        }

				
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length(); j++) {
				if((j+1) == temp[i].length()) {
					this.addElement(temp[i].charAt(j)+"", "###");
				}
				else if(j == 0){
					this.addFirst(temp[i].charAt(j)+"", temp[i].charAt(j+1)+"");
					
				}
				else {
					this.addElement(temp[i].charAt(j)+"", temp[i].charAt(j+1)+"");
				}
			}
        
		}
*/

		//for test purpose
		this.addFirst("中", "国");
		this.addElement("国", "人");
		this.addElement("人", "民");
		this.addElement("民", "###");

		
        
	}
        


	
	
	public String unescapeUnicode(String str){
        StringBuffer b=new StringBuffer();
        Matcher m = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(str);
        while(m.find())
            b.append((char)Integer.parseInt(m.group(1),16));
        return b.toString();
}




}
