import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int shotin = 0;
        int shotout = 0;
        for(int i=0 ; i<K ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x < 1 || y < 1 || x>R || y>C) {
                shotout++;
            } else {
                shotin++;
            }
        }

        System.out.println(shotin + "\n" + shotout);
        sc.close();
    }
}
