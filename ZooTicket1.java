import java.util.Scanner;

class ZooTicket {
    String name;
    boolean ride = false;
    boolean seal = false;
    boolean tiger = false; 

    ZooTicket(String name) {
        this.name = name;
    }

    public void bookRide() {
        ride = true;
    }
    public void bookSealShow() {
        seal = true;
    }
    public void bookTigerShow() {
        tiger = true;
    }

    public void summarize() {
        int sum = 100;
        System.out.println(name);
        if(ride == true) {
            sum += 40;
            System.out.println("Ride");
        }

        if(seal == true) {
            sum += 50;
            System.out.println("Seal");
        }
        
        if(tiger == true) {
            sum += 65;
            System.out.println("Tiger");
        }
        System.out.println(sum);
    }
}

public class ZooTicket1 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        String name = scan.next(); 
        ZooTicket ticket = new ZooTicket(name); 
        while(true) { 
            int service = scan.nextInt(); 
            if(service == 0) 
                break; 
            else if(service == 1) {
                ticket.bookRide();
            }
            else if(service == 2) {
                ticket.bookSealShow();
            }
            else if(service == 3) {
                ticket.bookTigerShow();
            }
        }  
        ticket.summarize();
        scan.close();
    }
}