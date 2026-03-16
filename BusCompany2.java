import java.util.Scanner; 
import java.util.ArrayList;

class Bus { 
    String id;
    int type;
    public int seats;
    public int seatsch = 0;
    private boolean status = true;
    Bus(String id, int type, int seats) {
        this.type = type;
        this.id = id;
        this.seats = seats;
    }

    public boolean reserve(int k) {
        if( k > 0 && k+seatsch <= seats && status == true) {
            seatsch += k;
            return true;
        } else {
            return false;
        }
    }

    public void sendToRepair() {
        status = false;
    } 

    public void backToService() {
        status = true;
    }
} 
 
public class BusCompany2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ArrayList<Bus> bus = new ArrayList<>();
        int Q = sc.nextInt();
        for(int i=0 ; i<Q ; i++) {
            String id = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            bus.add(new Bus(id, type, seats));
        }
         
        int N = sc.nextInt(); 
        for(int i = 0; i < N; ++i) { 
            int P = sc.nextInt(); 
            int K = sc.nextInt();
            int T = sc.nextInt();
            if(P == 1) {
                boolean check = false;
                for(int  j=0 ; j<bus.size() ; j++) {
                    Bus b = bus.get(j);
                    if(b.type == T) {
                        if(b.reserve(K)) {
                            check = true;
                            System.out.println(b.id);
                            break;
                        } 
                    }
                }
                if(!check) {
                    System.out.println("sorry");
                }
            }else if(P == 2) {
                Bus b = bus.get(T-1);
                b.sendToRepair();
            }else if(P == 3) {
                Bus b = bus.get(T-1);
                b.backToService();
            }
        } 
        sc.close();
    } 
} 