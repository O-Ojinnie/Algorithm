import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        
        String X = str.split(" ")[0];
        String Y = str.split(" ")[1];
        String Z = str.split(" ")[2];
        
        Set<String> set = new HashSet<String>();
        set.add(X);
        set.add(Y);
        set.add(Z);
        
        List<String> list = new ArrayList<String>(set);
        int maxNum = 0;
        for (int i = 0; i < list.size(); i++) {
            maxNum = Math.max(Integer.parseInt(list.get(i)), maxNum);
        }

        switch (list.size()) {
            case 1:
                System.out.println(10000 + (Integer.parseInt(list.get(0)) * 1000));
                break;
            case 2:
                if (X.equals(Y)) {
                    System.out.println(1000 + (Integer.parseInt(X) * 100));
                } else if(Y.equals(Z)) {
                    System.out.println(1000 + (Integer.parseInt(Y) * 100));
                } else if(X.equals(Z)) {
                	System.out.println(1000 + (Integer.parseInt(Z) * 100));
                }
                break;
            case 3:
                System.out.println(maxNum * 100);
                break;
        }
    }
}
