import java.util.Scanner;
public class Main {
   /* public static void main(String[] args) {
        Patient patient = new Patient("John");
        patient.setName("");
        System.out.println(patient);

    }
}

    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        user user = new user();
        int input = scanner.nextInt();
        int input2 = scanner.nextInt();
        user.setFirstName("Kolya");
        user.setLastName("");
        System.out.println(user.getFullname());
    }
}