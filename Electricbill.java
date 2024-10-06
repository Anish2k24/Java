import java.util.Scanner;

class Electricbill  {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int uc;
        double r = 0;
        double tax = 0;
        double fBill;

        System.out.println("Enter the electricity units:");
        uc = in.nextInt();
        if (uc >= 1 && uc <= 100) {
            r = uc * 0.80;
        } else if (uc >= 101 && uc <= 500) {
            r = uc * 1.20;
        } else if (uc >= 501 && uc <= 1000) {
            r = uc * 1.80;
        } else if (uc > 1000) {
            r = uc * 2.30;
        }if (r > 3500) {
            tax = r * 0.18;  
        } else {
            tax = r * 0.12;  
        }

        fBill = (r + tax + 350);

        System.out.println("Total bill: " + r);
        System.out.println("Bill with GST: " + tax);
        System.out.println("Final bill with water charge: " + fBill);
    }
}