import java.util.Scanner;
public class employeetax
{
    public static void main(String args[])
    {
        Scanner in =  new  Scanner(System.in);
        String n;
        int id;
        int i = 0;
        double s;
        double tax = 0;
        System.out.println("Enter Your Name:");
        n = in.nextLine();
        System.out.println("Enter Your Id Number:");
        id = in.nextInt();
        System.out.println("Enter Your Salary:");
        s = in.nextDouble();
        if (s >= 5000 && s <= 15000) {
        System.out.println("You have no tax deduction");
        }
        else if (s >= 15000 && s <= 55000) {
        tax = s * 0.12;
        i = 12;
        }
        else if (s >= 55000 && s <= 100000) {
        tax = s * 0.18;
        i = 18;
        }
        else if (s >= 100000) {
        tax = s * 0.15;
        i = 15;
        }
        System.out.println("You have "+i+"% tax deduction = " +tax);
        System.out.println("Your actual salary:" + s);
    }
}
