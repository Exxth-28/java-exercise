import java.util.Scanner;

public class battleship1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] Map = new int[R+1][C+1];

        
        for(int i = 1 ; i <= R ; i++ ) {
            for(int j = 1 ; j <= C ; j++) {
                 Map[i][j] = sc.nextInt();
            }
        }

        //int shotin = 0;
        int rightshot = 0;
        int misshot = 0;
        int reshot = 0;
        int remisshot = 0;
        int shotout = 0;
        int K = sc.nextInt();

        for(int i=0 ; i<K ; i++ ){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x <= R && x > 0 && y <= C && y >0) {
                //shotin++;
                if(Map[x][y] == 1) {
                    rightshot++;
                    Map[x][y]++;
                } else if(Map[x][y] > 1) {
                    reshot++;
                } else if(Map[x][y] == 0) {
                    misshot++;
                    Map[x][y] = -1;
                }
                else if(Map[x][y]== -1) {
                    Map[x][y] = -2;
                    remisshot++;
                }
            } else {
                shotout++;
            }
        }
        
        int flag = 0;
        for(int i=1 ; i<=R ; i++) {
            for(int j=1 ; j<=C ; j++) {
                if(Map[i][j] == 1) {
                    flag = 1;
                }
            }
        }
        
        //System.out.println(shotin + "\n" + shotout);
        System.out.println(rightshot);
        System.out.println(misshot);
        System.out.println(reshot);
        System.out.println(remisshot);
        System.out.println(shotout);

        if(flag == 0) {
            System.out.println("Attacker " + (rightshot + reshot));
        } else if(rightshot == 0) {
            System.out.println("battleship -1");
        } else {
            System.out.println("battleship " + misshot);
        }
        sc.close();
    }
}
