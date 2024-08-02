package algorithms.boj.string;

public class Q2744 {
	
	public static void main(String[] args) throws Exception{
		String inputStr = "WrongAnswer";
		char[] charArr = inputStr.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] < 'a') {
				charArr[i] += 32;
			}else {
				charArr[i] -= 32;
			}
		}
		System.out.println(charArr);
	}
	
}
