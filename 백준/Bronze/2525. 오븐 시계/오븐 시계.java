import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final int hour = 24;
    static final int minute = 60;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int timer = Integer.parseInt(bf.readLine());
        int X = Integer.parseInt(str.split(" ")[0]);
        int Y = Integer.parseInt(str.split(" ")[1]);

        int total = X * minute + Y + timer;

        int resultHour = total / minute % hour;
        int resultMinute = total % minute;

        System.out.println(resultHour + " " + resultMinute);
    }
}