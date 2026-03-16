import java.util.Scanner;

class House {
    public int w;
    public int l;
    int p = 0;

    public House(int w, int l) {
        this.w = w;
        this.l = l;
    }

    public void printPiggies() {
        System.out.println("Piggies " + p + ", Space " + 9*p);
    }

    public void encourage() {
        System.out.println("Piggy Together STRONG!");
    }

}

public class PiggyHouse {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); 
        int w = sc.nextInt(); 
        int l = sc.nextInt();
        int h = w*l;
        House house = new House(w, l);
        house.encourage();


        while(true){ 
            int K = sc.nextInt();
            if((9*(K+house.p)) <= h){
                house.p += K; 
                house.printPiggies();
            } 
            else{
                System.out.println("no space, need a new house"); 
                break;
            } 
        }
        sc.close();
    }
}