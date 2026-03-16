import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        int len = code.length();

        for(int i=0 ; i<len ; i++) {
            int num = sc.nextInt();
            char n = code.charAt(i);
            int sum = n + num;
            if(n + num > 'Z') {
                sum = num-('Z'-n) +'A' - 1;
            }
            System.out.print((char)(sum));
        }
        sc.close();
    }
}
