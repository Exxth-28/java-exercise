import java.util.Scanner;
import java.util.ArrayList;

public class email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> aryl = new ArrayList<>();

        while (true) {
            String in = sc.nextLine();
            if(in.length() == 0) {
                break;
            }
            String out = in.substring(0, in.indexOf('@'));
            aryl.add(out);
        }

        for(int i=0 ; i< aryl.size() ; i++) {
            System.out.println(aryl.get(i));
        }

        sc.close();
    }
}
