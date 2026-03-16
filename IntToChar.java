import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > (int)'Z' || N < (int)'A') {
            System.out.println("unsupported code");
        } else {
            System.out.println((char)N);
        }
        sc.close();
    }
}
