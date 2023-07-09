import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String token[] = str.split(" ");
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> chess = new ArrayList<Integer>();
		chess.add(1);
		chess.add(1);
		chess.add(2);
		chess.add(2);
		chess.add(2);
		chess.add(8);
		for(int i =0; i<token.length; i++) {
			input.add(Integer.parseInt(token[i]));
		}
		
	
		for(int i =0; i<chess.size(); i++) {
			System.out.println(chess.get(i)-input.get(i));
		}
	}

}
