import java.util.Scanner;

class ContactBook {
    String[] names;
    String[] phones;

    public ContactBook(String[] contect, String[] phonenum) {
        this.names = contect;
        this.phones = phonenum;
    }

    public void getAllContact() {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + phones[i]);
        }
    }

    public void getContact(String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(phones[i]);
                return;
            }
        }
        System.out.println("Invalid contact");
        return;
    }

    static boolean onlyDigits(String number) {
        if (number.length() == 0)
            return false;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    void editNumber(String name, String newnumber) {

        if (!onlyDigits(newnumber) ||
                newnumber.charAt(0) != '0' ||
                newnumber.length() < 9 ||
                newnumber.length() > 10) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                phones[i] = newnumber;
                System.out.println(name + " new number is " + newnumber);
                return;
            }
        }

        System.out.println("Invalid contact");
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] names = new String[N];
        String[] phones = new String[N];

        for (int i = 0; i < N; i++) {
            names[i] = sc.next();
            phones[i] = sc.next();
        }

        ContactBook book = new ContactBook(names, phones);

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                String name = sc.next();
                book.getContact(name);

            } else if (cmd == 2) {
                String name = sc.next();
                String newNumber = sc.next();
                book.editNumber(name, newNumber);

            } else if (cmd == 3) {
                book.getAllContact();

            } else {
                System.out.println("Invalid command");
            }
        }

        sc.close();
    }
}
 