import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int hour = 24;
	static final int minute = 60;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int X = Integer.parseInt(str.split(" ")[0]);
        int Y = Integer.parseInt(str.split(" ")[1]);

        if (0 < X && X < hour) {
            if (Y >= 45) {
                System.out.println(X + " " + (Y - 45));
            } else {
                System.out.println((X - 1) + " " + (minute - (45 - Y)));
            }
        } else if (X == 0) {
            if (Y >= 45) {
                System.out.println(X + " " + (Y - 45));
            } else {
                System.out.println((hour - 1) + " " + (minute - (45 - Y)));
            }
        }
	}
}
