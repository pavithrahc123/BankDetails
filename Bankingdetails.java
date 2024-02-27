import java.util.Scanner;

public class Bankingdetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        String accno = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Balance: ");
        long balance = sc.nextLong();
        System.out.println("Your account details: ");
        System.out.println("account number : " + accno);
        System.out.println("account holder name: "+ name);
        System.err.println("account balance :" + balance);

        for (int i = 1; i < 2; i++) {
            switch (i) {
                case 1:
                    if (balance <= 500) {
                        System.out.println(" Your account having balance less than 500");
                    } else {
                        System.out.println("balance  is more than 500 ");
                    }
                case 2:
                    if (balance >= 1000) {
                        System.out.println(" Your balance is more than 1000");
                    } else {
                        System.out.println("your balance is less than 1000");
                    }

                    break;

                default:
                    System.out.println("invalid");
                    break;
            }

        }
    }
}