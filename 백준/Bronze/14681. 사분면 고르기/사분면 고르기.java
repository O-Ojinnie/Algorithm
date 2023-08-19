import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int base = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String strX = bf.readLine();
		String strY = bf.readLine();
		int X = Integer.parseInt(strX);
		int Y = Integer.parseInt(strY);

		System.out.println((X > base) && (Y > base) ? 1 : (X > base) && (Y < base) ? 4 : (Y > base ? 2 : 3));

	}

}
