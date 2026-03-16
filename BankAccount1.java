    import java.util.Scanner;

    class Account {
        String name, code;
        double balance;
        boolean active;

        Account(String name , String code, double balance) {
            this.name = name;
            this.code = code;
            this.balance = balance;
            active = true;
            if(active) {
                System.out.println("Open account");
            }
        }

        void printInfo() {
            System.out.print(name + ", "
                + code + ", "
                + balance + ", "
            );
            if(active) {
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
            if(active) {
                balance += deposit;
                System.out.print(checkBalance());
                System.out.println(" true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }

        boolean withdrawn(double money) {
            if(active && money <= balance) {
                balance -= money;
                System.out.print(checkBalance());
                System.out.println(" true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
    }

    public class BankAccount1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money = scan.nextDouble();
            Account ac = new Account(name, code, money);
            int N = scan.nextInt();
            for (int i = 0; i < N; ++i) {
                int action = scan.nextInt();
                if(action == 1) {
                    ac.printInfo();
                } else if(action == 2) {
                    System.out.println(ac.checkBalance());
                } else if(action == 3) {
                    ac.closeAccount();
                } else if(action == 4) {
                    double dep = scan.nextDouble();
                    ac.deposit(dep);
                } else if(action == 5) {
                    double wit = scan.nextDouble();
                    ac.withdrawn(wit);
                }
            }
            scan.close();
        }
    }