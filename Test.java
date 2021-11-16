package hackthon;

public class Test {

	public static void main(String[] args) {
		
		long startTime=System.currentTimeMillis();

		
		SensitiveChecker sensitiveChecker = new SensitiveChecker();
		
		String input = "你们好吗"; //should return original
		String input1 = "中国"; //should return original
		
		String input2 = "中国人民你们好吗"; //should return original
		String input3 = "你们好吗中国人民"; //should not return original
		String input4 = "你们中国人民好吗"; //should not return original
		String input5 = "中国 人民"; //should not return original
		String input6 = "国人民"; //should return original


		
		Output output = sensitiveChecker.Check(input);
		Output output1 = sensitiveChecker.Check(input1);
		Output output2 = sensitiveChecker.Check(input2);
		Output output3 = sensitiveChecker.Check(input3);
		Output output4 = sensitiveChecker.Check(input4);
		Output output5 = sensitiveChecker.Check(input5);
		Output output6 = sensitiveChecker.Check(input6);


		System.out.println(output.getMessage());
		System.out.println(output1.getMessage());
		System.out.println(output2.getMessage());
		System.out.println(output3.getMessage());
		System.out.println(output4.getMessage());
		System.out.println(output5.getMessage());
		System.out.println(output6.getMessage());

		
		long endTime=System.currentTimeMillis();
		
		System.out.println("Program running time： "+(endTime-startTime)+"ms");

	}

}
