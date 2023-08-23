import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        if (1 <= N && N <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(N + " * " + i + " = " + (N * i));
            }
        }
    }
}
