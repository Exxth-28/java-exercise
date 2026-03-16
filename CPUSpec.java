import java.util.Scanner;

class CPU {
    public String mo;
    public int clocks;
    public int soc;
    public int memType;
    boolean vaild;
    CPU (String model, int clocks, int socket, int memType) {
        this.mo = model;
        this.clocks = clocks;
        this.soc = socket;
        this.memType = memType;
        this.vaild = isValidSpec(model, socket, memType);
    }

    boolean isValidSpec(String model, int socket, int memType) {
        if(model != null && model.length() > 2 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(
            mo + "\n"
            + clocks + "\n"
            + soc + "\n"
            + vaild
        );
    }
}

public class CPUSpec {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();
        
        if(model.isEmpty() && socket % 2 == 0)
            model = null;
        CPU cpu = new CPU(model, clocks, socket, memType);

        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        
        cpu.printInfo();

        sc.close();
    }
}
