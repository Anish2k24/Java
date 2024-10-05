impot java.util.Scanner;
class patern
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        char ch;
        int i;
       System.out.println("enter the name");
       s=in.nextLine();
       for(i=0;i<s.length();i++)
       {
        ch=s.charAt(i);
        if(i%2==0)
        System.out.println(Character.toUpperCase(ch));
        else
        System.out.println(Character.toLowerCase(ch));
       }
    }
}r