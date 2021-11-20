package Main;
import java.util.Scanner;

public class Main {
    public static void recurtion1()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            if (n%2==1)
            {
                System.out.println(n);
                recurtion1();
            }
            else {recurtion1();}
        }
    }
    public static int recurtion2()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){return 0;}
        else {return Math.max(n, recurtion2());}
    }
    public static void recurtion3(int max, int val){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            if(n>max)
                {recurtion3(n, 1);}
            else
                if (n==max)
                    {recurtion3(n, ++val);}
            else
                {recurtion3(n, val);}}
        else {System.out.println(val);}
        }
    public static void main(String[] args) {
        System.out.print("12.Нечетные числа\n");
        recurtion1();
        System.out.print("17.Максимум\n");
        System.out.println(recurtion2());
        System.out.print("16.Равное максимуму\n");
        recurtion3(0, 0);
    }
}
