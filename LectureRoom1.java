import java.util.Scanner;
import java.util.ArrayList;

class LectRoom {
    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;
    LectRoom(int classcode, String name, int capacity) {
        this.classCode = classcode;
        this.name = name;
        this.capacity = capacity;
    }

    public boolean reserveSeats(int seats) {
         if(currentSeats+seats <= capacity) {
            currentSeats+=seats;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return classCode + " " + name + " " + capacity;
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LectRoom> cla = new ArrayList<>();
        int K = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<K ; i++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();

            cla.add(new LectRoom(classCode, name, capacity));
        }

        int N = sc.nextInt();

        for(int i=0 ; i<N ; i++ ) {
            int classcode = sc.nextInt();
            int seats = sc.nextInt();
            boolean check = false;
            for(int j=0 ; j<cla.size() ; j++) {
                LectRoom lr = cla.get(j);
                if(classcode == lr.classCode) {
                    check = true;
                    if(lr.reserveSeats(seats)) {
                        System.out.println(lr.name);
                    } else {
                        System.out.println("sorry");
                    }
                    break;
                }
            }
            if(!check) {
                System.out.println("sorry");
            }
        }

        sc.close();
    }
}
