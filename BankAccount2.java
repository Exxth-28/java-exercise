import java.util.Scanner;

class Account {
    String name, code;
    double balance;
    boolean active;

    Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        System.out.print(name + ", " + code + ", " + balance + ", ");
        if (active) {
            System.out.println("active");
        } else {
            System.out.println("inactive");
        }
    }

    double checkBalance() {
        return balance;
    }

    void closeAccount() {
        active = false;
        printInfo();
    }

    boolean deposit(double deposit) {
        if (active) {
            balance += deposit;
            System.out.print(balance);
            System.out.println(" true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    boolean withdrawn(double money) {
        if (active && money <= balance) {
            balance -= money;
            System.out.print(balance);
            System.out.println(" true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

class Saving extends Account {
    String id, tel;
    boolean promptPay;

    Saving(String name, String code, double balance) {
        super(name, code, balance);
        id = "";
        tel = "";
        promptPay = false;
        System.out.println("Saving account");
    }

    void printInfo() {
        super.printInfo();
        if (promptPay) {
            System.out.print("PromptPay, ");
            if(!id.isEmpty()) {
                System.out.print(id);
            }
            if(!tel.isEmpty()) {
                System.out.println(tel);
            } else {
                System.out.println();
            }
        } else {
            System.out.println("no PromptPay");
        }
    }

    void closeAccount() {
        active = false;
        super.printInfo();
        if (promptPay) {
            System.out.println("PromptPay, " + id + ", " + tel);
        }
    }

    boolean openPromptPay(int N, String K) {
        if (N == 1 && K.length() == 13) {
            id = K;
            promptPay = true;
            return true;
        } else if (N == 2 && K.length() == 10) {
            tel = K;
            promptPay = true;
            return true;
        }
        return false;
    }
}

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Saving sv = new Saving(name, code, money);
        int N = scan.nextInt();

        for (int i = 0; i < N; ++i) {
            int action = scan.nextInt();
            if (action == 1) {
                sv.printInfo();
            } else if (action == 2) {
                System.out.println(sv.checkBalance());
            } else if (action == 3) {
                sv.closeAccount();
            } else if (action == 4) {
                double dep = scan.nextDouble();
                sv.deposit(dep);
            } else if (action == 5) {
                double wit = scan.nextDouble();
                sv.withdrawn(wit);
            } else if (action == 6) {
                int J = scan.nextInt();
                String K = scan.next();
                System.out.println(sv.openPromptPay(J, K));
            }
        }
        scan.close();
    }
}