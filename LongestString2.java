import java.util.Scanner;

public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int m = 0;
        int count = 0;
        while (true) {
            String input = sc.nextLine();
            m = input.length();
            if(input.length() == 0){
                break;
            }
            if(input.length() > max) {
                max = input.length();
                count = 0;
            }

            if(m == max) {
                count++;
            }
        }
        
        
        System.out.println(max + "\n" + count);
        sc.close();
    }
}
