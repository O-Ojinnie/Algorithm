import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int value = Integer.parseInt(sc.nextLine());
      int cnt = Integer.parseInt(sc.nextLine());
      
      int sum = 0;
      for(int i = 0; i < cnt; i++) {
         String str = sc.nextLine();
         String[] s = str.split(" ");
         int a = Integer.parseInt(s[0])*Integer.parseInt(s[1]);
         sum +=a;
         
      }
      if(sum==value) {
         System.out.println("Yes");
      }else {
         System.out.println("No");
      }
   }
}