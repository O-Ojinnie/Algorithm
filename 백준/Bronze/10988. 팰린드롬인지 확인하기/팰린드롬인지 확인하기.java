import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String str = bf.readLine();
		
		if (str.length() % 2 == 0) {	
			String first = str.substring(0, str.length() / 2);
			String last = str.substring(str.length() / 2);
			StringBuffer sb = new StringBuffer(last);
			String reverse = sb.reverse().toString();
			if(first.equals(reverse)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		} else {
			String first = str.substring(0, str.length() / 2);
			String last = str.substring((str.length() / 2) + 1);
			StringBuffer sb = new StringBuffer(last);
			String reverse = sb.reverse().toString();
			if(first.equals(reverse)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
