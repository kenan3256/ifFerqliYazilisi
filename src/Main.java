import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        System.out.println("a-edeini daxil edin: ");
        double a= sc.nextDouble();

        System.out.println("b-edeini daxil edin: ");
        double b= sc.nextDouble();

        System.out.println("emeliyyat daxil edin (+1; -2; *3; /4)");
        int c=sc.nextInt();

        double cavab=0;
        cavab = c==1? (a+b): c==2? (a-b): c==3? (a*b): c==4? (a/b) :0;
        System.out.println("cavab = "+cavab);
    }
}