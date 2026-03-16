import java.util.Scanner;

public class StartBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R + 1][C + 1];

        int shipCount = 0;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) shipCount++;
            }
        }

        int rightshot = 0;
        int misshot = 0;
        int reshot = 0;
        int remisshot = 0;
        int shotout = 0;

        int firstHit = -1;
        int lastHit = -1;

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < 1 || y < 1 || x > R || y > C) {
                shotout++;
            } else if (map[x][y] == 1) {
                rightshot++;
                map[x][y] = 2;
                shipCount--;
                if (firstHit == -1) firstHit = i + 1;
                if (shipCount == 0 && lastHit == -1) lastHit = i + 1;
            } else if (map[x][y] > 1) {
                reshot++;
            } else if (map[x][y] == 0) {
                misshot++;
                map[x][y] = -1;
            } else {
                remisshot++;
            }
        }

        System.out.println(rightshot);
        System.out.println(misshot);
        System.out.println(reshot);
        System.out.println(remisshot);
        System.out.println(shotout);

        if (shipCount == 0) {
            System.out.println("attacker " + lastHit);
        } else {
            System.out.println("battleship " + firstHit);
        }

        sc.close();
    }
}