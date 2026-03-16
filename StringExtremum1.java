import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String value = "A";
        while(true) {
            String a = sc.nextLine();
            if(a.length() == 0) {
                break;
            }
            if(N == 1) {
                if(a.length() >= max) {
                    max = a.length();
                    value = a;
                }
            } else if(N == 2) {
                if(a.length() <= min && a.length() != 1) {
                    min = a.length();
                    value = a;
                }
            }
        }

        if(N == 1) {
            System.out.println(max + "\n" + value);
        } else {
            System.out.println(min + "\n" + value);
        }
        sc.close();
    }
}
