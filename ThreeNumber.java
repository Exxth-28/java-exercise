import java.util.Scanner;

public class ThreeNumber {
    static int Max(int[] num3) {
        int max = num3[0];
        for(int num : num3) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    static int Median(int[] num3) {
        int max = Max(num3);
        int min = Min(num3);
        int sum = 0;
        for(int num : num3) {
            sum+=num;
        }
        int median = sum - max -min;
        return median;
    }

    static int Min(int[] num3) {
        int min = num3[0];
        for(int num : num3) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num3 = new int[3];
        for(int i = 0 ; i < 3 ; i++) {
            num3[i] = sc.nextInt();
        }
        int m = Max(num3);
        int med = Median(num3);
        int mi = Min(num3);

        int K = sc.nextInt();

        if(K == -1) {
            System.out.println(mi);
        } else if(K == 0) {
            System.out.print(med);
        } else if(K == 1) {
            System.out.print(m);
        }
        
        sc.close();
    }
}
