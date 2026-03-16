import java.util.Scanner;

class Blade {
    int size;
    int numb;
    int angle;
    double hp;
    boolean vaild = true;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        if (size < 16 || size > 24) {
            vaild = false;
            System.out.println("invalid size");
        }
        this.numb = number;
        if (number < 3 || number > 5) {
            vaild = false;
            System.out.println("invalid number of blades");
        }
        this.angle = angle;
        if (angle != 27 && angle != 30 && angle != 33) {
            vaild = false;
            System.out.println("invalid angle");
        }
        this.hp = hp;
        if (hp < 0) {
            vaild = false;
            System.out.println("invalid horsepower");
        }
    }

    void printInfo() {
        System.out.print(size + " " + numb + " " + angle + " " + hp + " ");
        System.out.println(vaild);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numb = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
        scan.close();
    }
}