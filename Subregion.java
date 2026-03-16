import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] Map = new int[R+1][C+1];

        // input Map to 0
        for(int i = 1 ; i <= R ; i++) {
            for(int j = 1 ; j <= C ; j++) {
                Map[i][j] = 0;
            }
        }

        int leftx = sc.nextInt();
        int lefty = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();

        int lengthr = leftx + r -1;
        int lengthc = lefty + c -1;

        //input mini Map

        if( lengthr > R || leftx < 1|| lengthc > C || lefty <1) {
            System.out.println("invalid input ");
        } else {
            for(int i = leftx ; i <= lengthr; i++) {
                for(int j = lefty ; j <= lengthc ; j++) {
                    Map[i][j] = 1;
                }
            }
        
            for(int i = 1 ; i <= R ; i++) {
                for(int j = 1 ; j <= C ; j++) {
                    System.out.print(Map[i][j] + " ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
