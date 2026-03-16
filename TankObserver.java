import java.util.Scanner;

class WaterTank {
    int width;
    int length;
    int height;
    int capacity;
    int volume = 0;
    
    WaterTank(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.capacity = width*height*length;
    }

    public int fill(int amount) {
        if(amount + volume > capacity) {
            System.out.println("Cannot fill the tank");
            return -1;
        } else {
            volume += amount;
            return volume;
        }
    }
}


public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width, length, height);

        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            int result = tank.fill(amount);
            System.out.println(result);
        }

        scan.close();
    }
}
